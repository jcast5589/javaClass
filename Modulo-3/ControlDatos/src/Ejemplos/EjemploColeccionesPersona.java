package Ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EjemploColeccionesPersona {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("1A", 100, 20));
        productos.add(new Producto("3A", 10, 20));
        productos.add(new Producto("2A", 800, 20));
        productos.add(new Producto("4A", 9, 30));

        Collections.sort(productos, new Comparator<Producto>() {
            @Override
            public int compare(Producto producto1, Producto producto2){
                return Integer.compare(producto1.getCantidad(), producto2.getCantidad());
            }
        });
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

}
