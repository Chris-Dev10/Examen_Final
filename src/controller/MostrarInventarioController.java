package controller;

import java.util.ArrayList;
import view.MostrarInventarioView;
import model.CostaldeCroquetas;


public class MostrarInventarioController {
    private MostrarInventarioView mostrarInventarioView;
    private ArrayList<CostaldeCroquetas> inventario;


    public MostrarInventarioController(MostrarInventarioView mostrarInventarioView, ArrayList<CostaldeCroquetas> inventario) {
        this.mostrarInventarioView = mostrarInventarioView;
        this.inventario = inventario;
    }


    public void showMostrarInventario() {
        mostrarInventarioView.startMostrarInventario(inventario);
    }
}
