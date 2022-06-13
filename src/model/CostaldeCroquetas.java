package model;

import java.io.Serializable;


public class CostaldeCroquetas implements Serializable {
    private String marca;
    private int peso;
    private String mascota;
    private float precio;

    
    public CostaldeCroquetas() {
        marca = null;
        peso = 0;
        mascota = null;
        precio = 0;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public int getPeso() {
        return peso;
    }


    public void setPeso(int peso) {
        this.peso = peso;
    }


    public String getMascota() {
        return mascota;
    }


    public void setMascota(String mascota) {
        this.mascota = mascota;
    }


    public float getPrecio() {
        return precio;
    }


    public void setPrecio(float precio) {
        this.precio = precio;
    }
}