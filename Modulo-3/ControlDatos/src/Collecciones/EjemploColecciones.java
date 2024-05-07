package Collecciones;
import java.util.ArrayList;
import java.util.HashMap;


public class EjemploColecciones {
    public static void main(String[] args) {
        

        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("uno", 2);
        mapa.put("dos", 1);
        mapa.put("tres",3);
        for (String clave: mapa.keySet()){
            System.out.println("Clave: " + clave + "\tValor: " + mapa.get(clave));
        }
    }   

}
