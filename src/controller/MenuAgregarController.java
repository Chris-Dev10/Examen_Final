package controller;

import view.MenuAgregarView;


public class MenuAgregarController {
    private MenuAgregarView menuAgregarView;
    private int opcion = 0;


    public MenuAgregarController(MenuAgregarView menuAgregarView) {
        this.menuAgregarView = menuAgregarView;
    }


    public int getOpcion() {
        return opcion;
    }


    public void showMenuAgregar() {
        opcion = menuAgregarView.startMenuAgregar();

        switch (opcion) {
            case 1:
                System.out.println("\t----------------------------------------------");
                System.out.println("\t  Pantalla de agregar venta en desarrollo...");
                System.out.println("\t----------------------------------------------");
                System.out.println();

                break;
            case 2:
                System.out.println("\t---------------------------------------------------");
                System.out.println("\t  Pantalla de agregar inventario en desarrollo...");
                System.out.println("\t---------------------------------------------------");
                System.out.println();

                break;
            case 3:
                System.out.println("\t----------------------------------");
                System.out.println("\t  Regresando a menu principal...");
                System.out.println("\t----------------------------------");
                System.out.println();

                break;
            default:
                System.out.println("\t------------------------------------------");
                System.out.println("\t  Opcion no existente, intente de nuevo.");
                System.out.println("\t------------------------------------------");
                System.out.println();
                
                break;
        }
    }
}
