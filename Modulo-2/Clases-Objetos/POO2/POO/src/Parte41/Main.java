package Parte41;



// Clase principal para probar la herencia
public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana", 50000);
        gerente.agregarMiembro("Carlos");
        gerente.agregarMiembro("Maria");

        System.out.println("Gerente: " + gerente.getNombre());
        System.out.println("Salario: " + gerente.getSalario());
        System.out.println("Equipo: " + gerente.equipo);
    }
}

