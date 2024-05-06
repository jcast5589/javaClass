package Parte1;

// Clase que define un vehículo
public class Vehiculo {
    // Atributos (campos)
    private String marca;
    private String modelo;

    // Constructor para inicializar objetos
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para obtener información del vehículo
    public String getInfo() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
}