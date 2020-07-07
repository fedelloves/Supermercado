
package dominio;

public class Higiene extends Producto {
    
    private Double contenido;
            
    public Higiene(String nombre, double contenido, double precio){
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public void mostrarInformacionProducto() {
        System.out.println("Nombre: " + this.getNombre() + " /// Contenido: " + this.getContenido() + "ml /// Precio: $" + this.getPrecio());
    }

    public Double getContenido() {
        return contenido;
    }
    
    

    
    
    
    
}
