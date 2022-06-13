package controller;

import java.io.*;
import java.util.ArrayList;

import model.CostaldeCroquetas;
import view.MenuPrincipalView;
import view.MenuAgregarView;
import view.MenuMostrarView;


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
                MenuAgregarView menuAgregarView = new MenuAgregarView();

                MenuAgregarController menuAgregarController = new MenuAgregarController(menuAgregarView);

                while (menuAgregarController.getOpcion() != 3) {
                    menuAgregarController.showMenuAgregar();
                }

                break;
            case 2:
                MenuMostrarView menuMostrarView = new MenuMostrarView();

                MenuMostrarController menuMostrarController = new MenuMostrarController(menuMostrarView);

                while (menuMostrarController.getOpcion() != 3) {
                    menuMostrarController.showMenuMostrar();
                }
                
                break;
            case 3:
                System.out.println("------------------------");
                System.out.println("  Cerrando programa...");
                System.out.println("------------------------");
                System.out.println();

                for (Object object : inventario) {
                    System.out.println(object);
                }
                
                
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