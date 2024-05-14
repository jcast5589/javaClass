package Matrices;

public class TranposicionMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
    };
    int[][] transpuesta = new int[matriz[0].length][matriz.length];
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            transpuesta[j][i] = matriz[i][j];
        }
    }


    System.out.println("Matriz Transpuesta:");
    for (int[] fila : transpuesta) {
        for (int elemento : fila) {
            System.out.print(elemento + " ");
        }
        System.out.println(); // Nueva línea después de cada fila
    }
    }
}
