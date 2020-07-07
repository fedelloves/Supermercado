
package dominio;


public class Main {
    
//Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19
//
//Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo
    
    public static void main(String[] args) {
        
        Supermercado supermercado = new Supermercado();
        
        supermercado.cargarProductos();
        supermercado.mostrarProductos();
        System.out.println("========================");
        
        
    }
    
}
