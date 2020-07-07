package dominio;

public abstract class Producto implements Comparable<Producto> {

    private String nombre;
    private Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Producto otroProducto) {
        if (this.precio < otroProducto.precio) {
            return -1; //es mas barato
        }
        if (this.precio > otroProducto.precio) {
            return 1; //es mas caro
        }
        return 0;
    }

}
