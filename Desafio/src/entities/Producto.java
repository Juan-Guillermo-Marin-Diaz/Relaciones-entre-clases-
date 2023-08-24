package entities;

public class Producto {
    
    private String nombre;
    private double precio;
    private Integer id;

    public Producto() {
    }

    public Producto(String nombre, double precio, Integer id) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", id=" + id + '}';
    }
    
}
