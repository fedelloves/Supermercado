
package dominio;

public abstract class Producto {
    
    private String nombre;
    private Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public abstract void mostrarInformacionProducto();

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }
    
    
    
    
    
}
