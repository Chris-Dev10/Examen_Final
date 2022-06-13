package view;

import java.util.Scanner;


public class AgregarInventarioView {
    private Scanner input;
    private String marca;
    private int peso;
    private String mascota;
    private float precio;
    
    
    public AgregarInventarioView() {
        input = new Scanner(System.in);
    }


    public void startAgregarInventario() {
        System.out.println("\t---- Agregar inventario ----");
        System.out.println();
        System.out.print("\tMarca: ");
        marca = input.nextLine();
        System.out.println();
        System.out.print("\tPeso del costal (kg): ");
        peso = input.nextInt();
        input.nextLine();
        System.out.println();
        System.out.print("\tTipo mascota: ");
        mascota = input.nextLine();
        System.out.println();
        System.out.print("\tPrecio: ");
        precio = input.nextFloat();
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


    public float getPrecio() {
        return precio;
    }
}
