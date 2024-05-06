package Parte5;

public class Producto {
    private String nombre;
    private double precio;
    private int contadorProductoHistorial;


    // constructor de inicializacion
    public Producto(){

    }
    public Producto(String nombre, double precio){
        this.contadorProductoHistorial = 0; 
        this.nombre = nombre;
        this.precio = precio;
        System.out.println("pasa por el contructu iniciad");

    }

    public Producto (int contadorProString){
        this.contadorProductoHistorial = contadorProString;
    }

    public Producto (Producto producto){
        this.nombre = producto.nombre;
    }

    public String getInfo(){
        return "Contador de producto es: " + this.contadorProductoHistorial + "  nombre: " + this.nombre + "   Prcio: "+ this.precio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
}
