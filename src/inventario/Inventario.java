package inventario;

/**
 * Clase: Inventario
 * @author Victor Manuel Perez Osorio
 * @version 1.0
 * @since 2025-03-02
 * 
 */

import java.util.ArrayList;

public class Inventario {
    
    /**
     * Devuelve la lista de productos almacenados en el inventario.
     *
     * @return ArrayList<Producto> Lista de Productos
     */
    public ArrayList<Producto> listaProductos;
   
    /**
 * Constructor de la clase Inventario. Inicializa la lista de productos con una
 * nueva instancia vacía.
 */
    public Inventario() {
        listaProductos = new ArrayList<>();
    }

    /**
 * Agrega un producto al inventario.
 *
 * @param p El producto que se va a agregar al inventario.
 * 
 */
    public void agregar(Producto p) {
        listaProductos.add(p);
    }

    /**
 * Muestra la información de todos los productos existentes en el inventario.
 */
    public void mostrar() {
        for (int i = 0; i < listaProductos.size(); i++) {
            listaProductos.get(i).mostrarInformacion();
        }
    }

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Producto p1 = Producto.createProduct("Laptop", 1200.99, 10);
        Producto p2 = Producto.createProduct("Mouse", 25.50, 50);
        
        inventario.agregar(p1);
        inventario.agregar(p2);
        
        System.out.println("Inventario de productos:");
        inventario.mostrar();


  
    }
}