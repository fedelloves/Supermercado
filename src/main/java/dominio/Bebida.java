package dominio;

public class Bebida extends Producto {

    private Double litros;

    public Bebida(String nombre, Double litros, Double precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " /// Litros: " + this.getLitros() + " /// Precio: $" + this.getPrecio();
    }

    public Double getLitros() {
        return litros;
    }

}
