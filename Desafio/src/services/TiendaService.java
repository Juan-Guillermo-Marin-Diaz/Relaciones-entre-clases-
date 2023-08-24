package services;

import entities.Tienda;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import entities.Producto;

/**
 *
 * @author facu
 */
public class TiendaService {
    private final Scanner leer;
    private final List<Tienda> tiendas;
    private final ProductoService productoService;

    public TiendaService(Scanner scanner) {
        this.leer = scanner;
        this.tiendas = new ArrayList<>();
        this.productoService = new ProductoService();
    }
    
    public void crearTienda() {
        System.out.println("Crear tienda");
        System.out.println("-------------");
        
        System.out.print("ID: ");
        int id = Integer.valueOf(leer.nextLine());
        
        System.out.print("Dirección: ");
        String direccion = leer.nextLine();
        
        System.out.print("Representante: ");
        String representante = leer.nextLine();
        
        this.tiendas.add(new Tienda(id, direccion, representante));
    }
    
    public void mostrarTiendas() {
        for (Tienda tienda : this.tiendas) {
            System.out.println(tienda);
        }
    }
    
    public void modificarTienda() {
        System.out.print("Que tienda deseas modificar (según su id)? ");
        int id = Integer.valueOf(leer.nextLine());
        
        for (Tienda tienda : this.tiendas) {
            if (tienda.getId() == id) {
                //...actualizar
                return;
            }
        }
        
        System.out.println("No existe dicha tienda");
    }
    
    public void eliminarTienda() {
        System.out.print("Que tienda deseas eliminar (según su id)? ");
        int id = Integer.valueOf(leer.nextLine());
        
        Iterator it = this.tiendas.iterator();
        
        while (it.hasNext()) {
            Tienda next = (Tienda) it.next();
            
            if (next.getId() == id) {
                it.remove();
                break;
            }
        }
        
        System.out.println("No existe dicha tienda");
    }
    
    /*
    AgregarProductos(): Agrega el producto elegido y la cantidad.
VenderProductos(): Vende cierta cantidad del producto.
EliminarProductos(): Elimina el Producto de esa tienda.
StockProductos(): Nos devuelve cuantos productos hay.
    */
    
    public void agregarProducto() {
        Producto nuevo = this.productoService.crearProducto();
        
        System.out.print("A que tienda deseas agregar el producto (según su id)? ");
        int id = Integer.valueOf(leer.nextLine());
        
        for (Tienda tienda : this.tiendas) {
            System.out.println("ID de la tienda actual: " + tienda.getId());
            if (tienda.getId() == id) {
                //Agrego el producto
                tienda.getProductos().add(nuevo);
                
                System.out.print("Indica la cantidad en stock disponible: ");
                int cantidad = Integer.valueOf(leer.nextLine());
                
                //Agrego el stock
                tienda.getStock().put(nuevo.getId(), cantidad);
                return;
            }
        }
        
        System.out.println("No existe dicha tienda");
    }

    public void venderProducto() {
        System.out.println("Por favor ingrese el ID de la tienda en la cual desea adquirir su producto");
        int idTienda = Integer.valueOf(leer.nextLine());

        for (Tienda tienda:tiendas) {

            if (tienda.getId() == idTienda){

                System.out.print("Que producto desea comprar? ");
                int id = Integer.valueOf(leer.nextLine());

                for (Producto product : tienda.getProductos()) {

                    if (product.getId() == id) {

                        tienda.getStock().put(id, tienda.getStock().get(id) - 1);
                        break;
                    }
                }
                break;
            }
        }
        System.out.println("La tienda seleccionada no existe");
    }

    public void stockProductos() {
        System.out.print("Tienda la cual deseas ver el stock? ");
        int id = Integer.valueOf(leer.nextLine());

        for (Tienda tienda : this.tiendas) {
            if (tienda.getId() == id) {

                System.out.println("Hay un total de " + tienda.getStock().size() + " productos.");

                for (int productoID : tienda.getStock().keySet()) {
                    System.out.println("Producto #" + productoID + ": " + tienda.getStock().get(productoID));
                }
            }
        }
    }
}


