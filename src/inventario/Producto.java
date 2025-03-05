package inventario;
/**
 * Clase: Producto
 * @author Victor Manuel Perez Osorio
 * @version 1.0
 * @since 2025-03-02
 * 
 */

public class Producto {

   

    private String nombre;
    private double precio;
    private int stock;

        // Constructor se hace privado
    private Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    /**
 * Crea un nuevo producto con los datos proporcionados.
 *
 * @param nombre El nombre del producto.
 * @param precio El precio del producto.
 * @param stock La cantidad en stock del producto.
 * @return Producto - El producto creado con los parámetros especificados.
 * @throws IllegalArgumentException Si algún parámetro tiene un valor inválido 
 * (ejemplo: precio negativo o stock negativo).
 */
     public static Producto createProduct(String nombre, double precio, int stock) {
        return new Producto(nombre, precio, stock);
    }
  
    /**
     * @return the nombre 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
 * Muestra la información del producto en la consola 
 */
    public void mostrarInformacion() {
        System.out.println("Producto: " + getNombre() + " | Precio: " + getPrecio() + " | Stock: " + getStock());
    }

}