package dominio;

import java.util.ArrayList;
import java.util.Collections;

public class Supermercado {

    ArrayList<Producto> listaProductos = new ArrayList<>();

    public void cargarProductos() {

        listaProductos.add(new Bebida("Coca-Cola Zero", 1.5, 20.0));
        listaProductos.add(new Bebida("Coca-Cola", 1.5, 18.0));
        listaProductos.add(new Higiene("Shampoo Sedal", 500.0, 19.0));
        listaProductos.add(new Fruta("Frutillas", 64.0, "kilo"));

    }

    public void mostrarInformacionDeProductos() {
        listaProductos.forEach((producto) -> {
            System.out.println(producto);
        });

    }

    public String productoMasCaro() {

        return Collections.max(listaProductos).getNombre();

    }

    public String productoMasBarato() {

        return Collections.min(listaProductos).getNombre();

    }

}
