package dominio;

public class Main {

    public static void main(String[] args) {

        Supermercado supermercado = new Supermercado();

        supermercado.cargarProductos();
        supermercado.mostrarInformacionDeProductos();
        System.out.println("========================");
        System.out.println("Producto mas caro: " + supermercado.productoMasCaro());
        System.out.println("Producto mas barato: " + supermercado.productoMasBarato());

    }

}
