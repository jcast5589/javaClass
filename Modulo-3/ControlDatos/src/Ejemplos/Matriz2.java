package Ejemplos;

public class Matriz2 {
    public static int[][] llenarMatrizInverso(int n){
        int [][] matriz = new int[n][n]; 
        int valor = 1;
        int iniciofila = 0; int finFila = n-1;
        int inicioColumna = 0; int finColumna = n -1;
        while (inicioColumna <= finColumna && iniciofila <=  finColumna) {    

            for(int i = finFila; i >= inicioColumna; i--){
                matriz[iniciofila][i] = valor ++;
            }
            iniciofila++;
            for (int i = iniciofila; i <= finColumna; i++ ){
                matriz[i][inicioColumna]= valor++;
            }
            inicioColumna++;
            for(int i = inicioColumna; i <= finFila; i++){
                matriz[finColumna][i]=valor++;
            }
            finColumna--;
            
            for(int i = finColumna ; i >= iniciofila ; i--){
                matriz[i][finFila]=valor++;
            }
            finFila--;

        }
        return matriz;
    }
    public static void main(String[] args) {
        int n = 3;
        int[][] matriz = llenarMatrizInverso(n);
        for (int[] is : matriz) {
            for (int is2 : is) {
                System.out.print(is2 + "\t");
            }
            System.out.println();
        }
    }
}
