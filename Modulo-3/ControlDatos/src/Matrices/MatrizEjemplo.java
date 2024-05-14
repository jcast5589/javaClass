package Matrices;

public class MatrizEjemplo {
   public static void main(String[] args) {
    
     //3*3
     int[][] matriz = {
        {1,2,3},    //0
        {4,5,6},    //1
        {7,8,9}   //2
    };

    int elemento = matriz [1][2];
    System.out.println("\n"+ elemento +"\n"+"\n"+"\n"); 
    
    for(int i = 0; i < matriz.length; i++){
        for(int j = 0; j < matriz[i].length; j++){
            System.out.print(matriz[i][j]+"\t");
        }
        System.out.println('\n');
    }

    int [][] matriz1 = new int[3][3];
    matriz1[2] = new int[] {9,8,7};
    matriz1[1] = new int[] {6,5,4};
    matriz1[0] = new int[] {3,2,1};


    for(int i = 0; i < matriz1.length; i++){
        for(int j = 0; j < matriz1[i].length; j++){
            System.out.print(matriz1[i][j]+"\t");
        }
        System.out.println('\n');
    }
    System.out.println('\n'+'\n'+'\n');

    int[][] suma = new int[matriz1.length] [matriz1[0].length];
    for (int i =0; i<matriz1.length; i++){
        for(int j = 0; j < matriz1[i].length; j++){
            suma[i][j]=matriz[i][j]+matriz1[i][j];
        }
    }

    for(int [] fila: suma){
        for (int i : fila) {
            System.out.println(i+'\t');
        }
        System.out.println();
    }
   }


}
