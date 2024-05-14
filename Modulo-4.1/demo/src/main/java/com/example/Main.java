package com.example;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class Main {
    
    public static void main(String[] args) {
         try (CSVReader reader = new CSVReader(new FileReader("datos/datos.csv"))) {
            String [] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                for(String token : nextLine){
                    System.out.println(token + "-");                }
                    System.out.println();
            }
        } catch (IOException | CsvValidationException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
