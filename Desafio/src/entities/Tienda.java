package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author facu
 */
public class Tienda {
    private final int id;
    private final List<Producto> productos;
    private final HashMap<Integer, Integer> stock;
    private final String direccion;
    private final String representante;

    public Tienda(int id, String direccion, String representante) {
        this.id = id;
        this.productos = new ArrayList<>();
        this.stock = new HashMap<>();
        this.direccion = direccion;
        this.representante = representante;
    }
    
    public int getId() {
        return this.id;
    }
    
    public List<Producto> getProductos() {
        return this.productos;
    }
    
    public HashMap<Integer, Integer> getStock() {
        return this.stock;
    }
}
