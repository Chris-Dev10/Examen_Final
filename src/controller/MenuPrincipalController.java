package controller;

import java.io.*;
import java.util.ArrayList;

import model.CostaldeCroquetas;
import view.MenuPrincipalView;
import view.MostrarInventarioView;
import view.AgregarInventarioView;


public class MenuPrincipalController {
    private MenuPrincipalView menuPrincipalView;
    private ArrayList<CostaldeCroquetas> inventario;
    private int opcion = 0;


    public MenuPrincipalController(MenuPrincipalView menuPrincipalView) {
        this.menuPrincipalView = menuPrincipalView;
        inventario = new ArrayList<>();
    }


    public void loadInventario() throws IOException, ClassNotFoundException {
        File file = new File(".\\src\\model\\inventario.txt");

        if (file.length() != 0) {
            FileInputStream fileInputStream = null;
            fileInputStream = new FileInputStream(".\\src\\model\\inventario.txt");

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            while (fileInputStream.available() != 0) {
                inventario.add((CostaldeCroquetas) objectInputStream.readObject());
            }

            objectInputStream.close();
            fileInputStream.close();
        }
    }


    public int getOpcion() {
        return opcion;
    }


    public void showMenuPrincipal() throws IOException {
        opcion = menuPrincipalView.startMenuPrincipal();

        switch (opcion) {
            case 1:
                AgregarInventarioView agregarInventarioView = new AgregarInventarioView();

                AgregarInventarioController agregarInventarioController = new AgregarInventarioController(agregarInventarioView);
                agregarInventarioController.showAgregarInventario();
                inventario.add(agregarInventarioController.agregarInventario());

                break;
            case 2:
                MostrarInventarioView mostrarInventarioView = new MostrarInventarioView();

                MostrarInventarioController mostrarInventarioController = new MostrarInventarioController(mostrarInventarioView, inventario);
                mostrarInventarioController.showMostrarInventario();
                
                break;
            case 3:
                System.out.println("------------------------");
                System.out.println("  Cerrando programa...");
                System.out.println("------------------------");
                System.out.println();
                
                break;
            default:
                System.out.println("------------------------------------------");
                System.out.println("  Opcion no existente, intente de nuevo.");
                System.out.println("------------------------------------------");
                System.out.println();
                
                break;
        }
    }
}