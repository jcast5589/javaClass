package Ejemplos;

public class MatrizEspiral {

    public static int[][] llenarMatriz(int n){
        int [][] matriz = new int[n][n];
        int valor = 1;
        int inicioFila = 0; 
        int inicioColumna = 0;
        int finFila=n-1;
        int finColumna= n-1;
        System.out.println();
        while(inicioColumna<=finColumna && inicioFila <= finFila){
            for(int i = inicioColumna; i <= finColumna; i++){
                matriz[inicioColumna][i] = valor++;
            }
            inicioFila++;


            for(int i = inicioFila; i <= finFila; i++){
                matriz[i][finColumna] = valor++;
            }


            finColumna--;
            for(int i = finColumna; i >= inicioColumna; i--){
                matriz[finFila][i]=valor++;
            }


            finFila--;
            for(int i = finFila ; i >= inicioFila; i-- ){
                matriz[i][inicioColumna] = valor++;
            }

            inicioColumna ++;
        }

        

        return matriz;
    }
    public static void main(String[] args) {
        int n = 10;
        int[][] matriz = llenarMatriz(n);
        for (int[] is : matriz) {
            for (int is2 : is) {
                System.out.print(is2 + "\t");
            }
            System.out.println();
        }
    }
}
