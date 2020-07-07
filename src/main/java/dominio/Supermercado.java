package dominio;

import java.util.ArrayList;

public class Supermercado {

    ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    public void cargarProductos() {

        listaProductos.add(new Bebida("Coca-Cola Zero", 1.5, 20.0));
        listaProductos.add(new Bebida("Coca-Cola", 1.5, 18.0));
        listaProductos.add(new Higiene("Shampoo Sedal", 500, 19));
        listaProductos.add(new Fruta("Frutillas", 64, "kilo"));

    }

    public void mostrarProductos() {
        listaProductos.forEach((producto) -> {
            producto.mostrarInformacionProducto();
        });

    }

}
