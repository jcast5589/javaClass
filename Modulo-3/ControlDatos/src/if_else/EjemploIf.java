package if_else;

public interface EjemploIf {
    
    public static void main(String[] args) {
        int numero = 9;
       
        if(numero > 10 ){
            System.out.println( "El numeor es mayot a 10");
        }
        else if(numero == 10){
            System.out.println("El numero es igual al 10");
        }
        else{
            System.out.println( "El numero es menor a 10");
        }
    }

}
