package inventario;

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
  
        // Método de fábrica
    public static Producto crearProducto(String nombre, double precio, int stock) {
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

    public void mostrarInformacion() {
        System.out.println("Producto: " + getNombre() + " | Precio: " + getPrecio() + " | Stock: " + getStock());
    }

    public void borrarDatos() {
        setNombre("");
        setPrecio(0.0);
        setStock(0);
    }
}