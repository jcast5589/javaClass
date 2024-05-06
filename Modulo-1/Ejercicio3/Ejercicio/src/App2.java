import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir dimensiones para el rectángulo
        System.out.print("Introduce la longitud del rectángulo: ");
        double longitud = scanner.nextDouble();
        
        System.out.print("Introduce la anchura del rectángulo: ");
        double anchura = scanner.nextDouble();

        // Pedir radio para el círculo
        System.out.print("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular área y perímetro del rectángulo
        double areaRectangulo = longitud * anchura;
        double perimetroRectangulo = 2 * (longitud + anchura);

        // Calcular área y perímetro del círculo
        double areaCirculo = Math.PI * radio * radio;
        double perimetroCirculo = 2 * Math.PI * radio;

        // Comparar áreas y perímetros
        boolean esRectanguloMayorEnArea = areaRectangulo > areaCirculo;
        boolean esRectanguloMayorEnPerimetro = perimetroRectangulo > perimetroCirculo;

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Perímetro del círculo: " + perimetroCirculo);

        // Mostrar comparaciones
        if (esRectanguloMayorEnArea) {
            System.out.println("El rectángulo tiene mayor área que el círculo.");
        } else {
            System.out.println("El círculo tiene mayor área que el rectángulo.");
        }

        if (esRectanguloMayorEnPerimetro) {
            System.out.println("El rectángulo tiene mayor perímetro que el círculo.");
        } else {
            System.out.println("El círculo tiene mayor perímetro que el rectángulo.");
        }

        scanner.close();
    }
}
