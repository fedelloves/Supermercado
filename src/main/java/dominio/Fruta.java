package dominio;

public class Fruta extends Producto {

    private String unidadDeVenta;

    public Fruta(String nombre, double precio, String unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " /// Precio: $" + this.getPrecio() + " /// Unidad de venta: " + this.getUnidadDeVenta();
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

}
