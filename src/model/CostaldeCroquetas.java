package model;


public class CostaldeCroquetas {
    private int id;
    private String marca;
    private int peso;
    private String mascota;

    
    public CostaldeCroquetas() {
        id = 0;
        marca = null;
        peso = 0;
        mascota = null;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
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
}