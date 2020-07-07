
package dominio;

public class Bebida {
    
    private String nombre;
    private Double litros;
    private Double precio;

    public Bebida(String nombre, Double litros, Double precio) {
        this.nombre = nombre;
        this.litros = litros;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getLitros() {
        return litros;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
    
}
