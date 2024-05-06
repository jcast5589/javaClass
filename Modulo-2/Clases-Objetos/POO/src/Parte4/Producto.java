package Parte4;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    // Constructor para inicializar
    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    // Métodos para obtener información
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }
}
