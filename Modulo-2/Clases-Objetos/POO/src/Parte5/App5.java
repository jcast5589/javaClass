package Parte5;

public class App5 {

    public static void main(String[] args) {
        CalculadoraAvanzada calc = new CalculadoraAvanzada();

        System.out.println("Suma: " + calc.sumar(10, 20));
        System.out.println("Resta: " + calc.restar(20, 10));
        System.out.println("Multiplicación: " + calc.multiplicar(5, 4));
        System.out.println("División: " + calc.dividir(20, 5));
    }
}
