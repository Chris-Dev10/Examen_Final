package controller;

import view.MenuPrincipalView;
import view.MenuAgregarView;
import view.MenuMostrarView;


public class MenuPrincipalController {
    private MenuPrincipalView menuPrincipalView;
    private int opcion = 0;


    public MenuPrincipalController(MenuPrincipalView menuPrincipalView) {
        this.menuPrincipalView = menuPrincipalView;
    }


    public int getOpcion() {
        return opcion;
    }


    public void showMenuPrincipal() {
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
