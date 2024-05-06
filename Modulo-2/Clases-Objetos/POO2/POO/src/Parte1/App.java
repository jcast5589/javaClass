package Parte1;

public class App {
    public static void main(String[] args) throws Exception {
       Vehiculo carro = new Vehiculo("rojo", "2003");
       System.out.println(carro.getInfo("2009"));
       System.out.println(carro.getColor());

    }
}
