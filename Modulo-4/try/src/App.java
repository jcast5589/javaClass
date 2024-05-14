public class App {
    public static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Acceso es denegado - Por la edad de los 18 años");
        }
        else{
            System.out.println("Accesos concedidio - por la edad de 18 años");
        }
    }

    public static void main(String[] args) {
       
      checkAge(15);
    }
}
