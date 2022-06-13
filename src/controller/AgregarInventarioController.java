package controller;

import java.io.*;
import model.CostaldeCroquetas;
import view.AgregarInventarioView;


public class AgregarInventarioController {
    private AgregarInventarioView agregarInventarioView;


    public AgregarInventarioController(AgregarInventarioView agregarInventarioView) {
        this.agregarInventarioView = agregarInventarioView;
    }


    public void showAgregarInventario() {
        agregarInventarioView.startAgregarInventario();
    }


    public void agregarInventario() throws IOException {
        CostaldeCroquetas costaldeCroquetas = new CostaldeCroquetas();
        costaldeCroquetas.setMarca(agregarInventarioView.getMarca());
        costaldeCroquetas.setPeso(agregarInventarioView.getPeso());
        costaldeCroquetas.setMascota(agregarInventarioView.getMascota());

        File file = new File(".\\src\\model\\inventario.txt");

        FileOutputStream fileOutputStream = null;
        fileOutputStream = new FileOutputStream(".\\src\\model\\inventario.txt", true);

        if (file.length() == 0) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(costaldeCroquetas);

            objectOutputStream.close();
        } else {
            AppendObjectOutputStream appendObjectOutputStream = null;
            appendObjectOutputStream = new AppendObjectOutputStream(fileOutputStream);
            appendObjectOutputStream.writeObject(costaldeCroquetas);
            
            appendObjectOutputStream.close();
        }

        fileOutputStream.close();
    }
}


class AppendObjectOutputStream extends ObjectOutputStream {
    protected AppendObjectOutputStream(OutputStream outputStream) throws IOException, SecurityException {
        super(outputStream);
    }
    

    @Override
    public void writeStreamHeader() throws IOException {
        return;
    }
}