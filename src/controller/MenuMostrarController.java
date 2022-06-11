package controller;

import view.MenuMostrarView;


public class MenuMostrarController {
    private MenuMostrarView menuMostrarView;
    private int opcion = 0;

    
    public MenuMostrarController(MenuMostrarView menuMostrarView) {
        this.menuMostrarView = menuMostrarView;
    }

    
    public int getOpcion() {
        return opcion;
    }


    public void showMenuMostrar() {
        opcion = menuMostrarView.startMenuMostrar();

        switch (opcion) {
            case 1:
                System.out.println("\t----------------------------------------------");
                System.out.println("\t  Pantalla de mostrar venta en desarrollo...");
                System.out.println("\t----------------------------------------------");
                System.out.println();
                
                break;
            case 2:
                System.out.println("\t---------------------------------------------------");
                System.out.println("\t  Pantalla de mostrar inventario en desarrollo...");
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
