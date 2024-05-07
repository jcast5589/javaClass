package Ejemplos;

import java.util.ArrayList;

public class EjemploColeccionesPersona {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("1A", 100, 20));
        productos.add(new Producto("3A", 10, 20));
        productos.add(new Producto("2A", 800, 20));
        productos.add(new Producto("4A", 10000, 30)); 

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
