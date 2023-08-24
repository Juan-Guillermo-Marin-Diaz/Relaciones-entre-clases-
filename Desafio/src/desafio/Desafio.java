package desafio;

import java.util.Scanner;
import services.TiendaService;

/**
 *
 * @author facu
 */
public class Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        TiendaService ts = new TiendaService(scanner);
        
        ts.crearTienda();
        
        ts.agregarProducto();

        ts.stockProductos();

        ts.venderProducto();

        ts.stockProductos();


    }
    
}
