package services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import entities.Producto;

public class ProductoService {

    private Scanner leer;
    private ArrayList<Producto> productos = new ArrayList();

    public ProductoService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.productos = new ArrayList();
    }

    public Producto crearProducto() {

        Producto prod = new Producto();

        System.out.println("Ingrese el id del producto: ");
        prod.setId(leer.nextInt());

        System.out.println("Ingrese el nombre del producto: ");
        prod.setNombre("producto");

        System.out.println("Ingrese el precio del producto: ");
        prod.setPrecio(100);

        return prod;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void agregarNuevoProducto() {
        boolean bandera = true;
        int aux;
        Producto productoCreado = crearProducto();
        agregarProducto(productoCreado);
        while (bandera) {
            System.out.println("Desea agregar un nuevo pais: \n1. Si \n2. No");
            aux = leer.nextInt();
            System.out.println("");
            if (aux == 1) {
                productoCreado = crearProducto();
                agregarProducto(productoCreado);
            } else {
                bandera = false;
            }
        }
    }

    public void actualizarProducto() {
        System.out.println("Ingrese el nombre del producto que desea alterar: ");
        String aux = leer.next();
        System.out.println("Ingrese el precio que desea alterar: ");
        double auxPrice = leer.nextDouble();
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(aux)) {
                producto.setPrecio(auxPrice);
                return;
            }
        }
        System.out.println("El producto no ha sido encontrado");
    }

    public void eliminarProducto() {
        Iterator iterator = productos.iterator();
        System.out.println("");
        System.out.println("Ingrese el id del producto que quiere eliminar: ");
        int auxID = leer.nextInt();
        while (iterator.hasNext()) {
            Producto next = (Producto) iterator.next();
            if (next.getId() == auxID) {
                iterator.remove();
            }
        }
    }

    public void mostrarProducto() {
        System.out.println("");
        System.out.println("Los productos actuales son: ");
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
        System.out.println("Cantidad =  " + productos.size());
    }
}
