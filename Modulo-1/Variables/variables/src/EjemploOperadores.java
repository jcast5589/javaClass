public class EjemploOperadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        // Operadores aritméticos
        int suma = a + b;
        int resta = b - a;
        
        // Operadores relacionales
        boolean esMayor = a < b; // true
        boolean esIgual = a == 10; // true
        
        // Operadores lógicos
        boolean esCierto = (a < b) && (b == 20); // true
        boolean esFalso = (a > b) || (b != 20); // false
        
        // Imprimir resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Es mayor: " + esMayor);
        System.out.println("Es igual: " + esIgual);
        System.out.println("Es cierto: " + esCierto);
        System.out.println("Es falso: " + esFalso);
    }
}
