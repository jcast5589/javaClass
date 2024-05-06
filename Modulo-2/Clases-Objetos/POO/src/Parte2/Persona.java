package Parte2;

public class Persona {
    private String nombre;
    private int edad;

    // Constructor para inicializar
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos para obtener información
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
