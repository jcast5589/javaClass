package com.example;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try (CSVWriter writer = new CSVWriter(new FileWriter("Datos_Nuevos.csv"))) {
            String[] nuevaFila1 = { "Nombre", "Edad", "Ciudad" };
            String[] nuevaFila2 = { "Juan", "25", "Barcelona" };
            String[] nuevaFila3 = { "María", "30", "Madrid" };
            String[] nuevaFila4 = { "Carlos", "28", "Valencia" };
            writer.writeNext(nuevaFila1);
            writer.writeNext(nuevaFila2);
            writer.writeNext(nuevaFila3);
            writer.writeNext(nuevaFila4);
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
