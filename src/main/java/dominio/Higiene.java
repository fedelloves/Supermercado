package dominio;

public class Higiene extends Producto {

    private Double contenido;

    public Higiene(String nombre, Double contenido, Double precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " /// Contenido: " + this.getContenido() + "ml /// Precio: $" + this.getPrecio();
    }

    public Double getContenido() {
        return contenido;
    }

}
