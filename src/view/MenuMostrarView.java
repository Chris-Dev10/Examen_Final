package view;

import java.util.Scanner;


public class MenuMostrarView {
    private Scanner input;


    public MenuMostrarView() {
        input = new Scanner(System.in);
    }


    public int startMenuMostrar() {
        System.out.println("\t---- Menu mostar ----");
        System.out.println();
        System.out.println("\t1.- Mostrar ventas.");
        System.out.println("\t2.- Mostrar inventario.");
        System.out.println("\t3.- Regresar.");
        System.out.println();
        System.out.print("\tOpcion: ");
        int opcion = input.nextInt();
        System.out.println();
        
        return opcion;
    }    
}
