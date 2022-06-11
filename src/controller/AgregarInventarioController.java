package controller;

import java.io.*;

import model.CostaldeCroquetas;
import view.AgregarInventarioView;


public class AgregarInventarioController {
    private AgregarInventarioView agregarInventarioView;
    private int cantidad;


    public AgregarInventarioController(AgregarInventarioView agregarInventarioView) {
        this.agregarInventarioView = agregarInventarioView;
    }


    public void showAgregarInventario() {
        agregarInventarioView.startAgregarInventario();

        cantidad = agregarInventarioView.getCantidad();
    }


    public void agregarInventario() {
        CostaldeCroquetas costaldeCroquetas = new CostaldeCroquetas();
        costaldeCroquetas.setMarca(agregarInventarioView.getMarca());
        costaldeCroquetas.setPeso(agregarInventarioView.getPeso());
        costaldeCroquetas.setMascota(agregarInventarioView.getMascota());

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(".\\src\\model\\inventario.txt"));
        
            bufferedWriter.write("Marca: " + costaldeCroquetas.getMarca() + "\n");
            bufferedWriter.write("Peso: " + Integer.toString(costaldeCroquetas.getPeso()) + "\n");
            bufferedWriter.write("Mascota: " + costaldeCroquetas.getMascota() + "\n");
            bufferedWriter.write("Cantidad: " + Integer.toString(cantidad) + "\n");

            bufferedWriter.close();
        } catch(Exception exception) {
            return;
        }
    }
}
