package view;

import java.util.Scanner;


public class AgregarInventarioView {
    private Scanner input;
    private String marca;
    private int peso;
    private String mascota;
    
    
    public AgregarInventarioView() {
        input = new Scanner(System.in);
    }


    public void startAgregarInventario() {
        System.out.println("\t\t---- Agregar inventario ----");
        System.out.println();
        System.out.print("\t\tMarca: ");
        marca = input.nextLine();
        System.out.println();
        System.out.print("\t\tPeso: ");
        peso = input.nextInt();
        input.nextLine();
        System.out.println();
        System.out.print("\t\tMascota: ");
        mascota = input.nextLine();
        System.out.println();
    }


    public String getMarca() {
        return marca;
    }


    public int getPeso() {
        return peso;
    }


    public String getMascota() {
        return mascota;
    }
}
