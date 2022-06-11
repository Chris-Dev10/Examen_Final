package view;

import java.util.Scanner;


public class MenuPrincipalView {
    private Scanner input;


    public MenuPrincipalView() {
        input = new Scanner(System.in);
    }


    public int startMenuPrincipal() {
        System.out.println("---- Menu Principal ----");
        System.out.println();
        System.out.println("1.- Agregar.");
        System.out.println("2.- Mostrar.");
        System.out.println("3.- Salir.");
        System.out.println();
        System.out.print("Opcion: ");
        int opcion = input.nextInt();
        System.out.println();
        
        return opcion;
    }
}
