package view;

import java.util.ArrayList;
import model.CostaldeCroquetas;


public class MostrarInventarioView {
    public void startMostrarInventario(ArrayList<CostaldeCroquetas> inventario) {
        System.out.println("\t---- Mostrar inventario ----");
        System.out.println();
        for (CostaldeCroquetas costaldeCroquetas : inventario) {
            System.out.println("\tMarca: " + costaldeCroquetas.getMarca());
            System.out.println("\tPeso del costal (kg): " + costaldeCroquetas.getPeso());
            System.out.println("\tTipo mascota: " + costaldeCroquetas.getMascota());
            System.out.println("\tPrecio: " + costaldeCroquetas.getPrecio());
            System.out.println();
        }
    }
}
