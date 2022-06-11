package view;

import java.util.Scanner;


public class MenuAgregarView {
    private Scanner input;


    public MenuAgregarView() {
        input = new Scanner(System.in);
    }


    public int startMenuAgregar() {
        System.out.println("\t---- Menu agregar ----");
        System.out.println();
        System.out.println("\t1.- Agregar venta.");
        System.out.println("\t2.- Agregar inventario.");
        System.out.println("\t3.- Regresar.");
        System.out.println();
        System.out.print("\tOpcion: ");
        int opcion = input.nextInt();
        System.out.println();
        
        return opcion;
    }
}
