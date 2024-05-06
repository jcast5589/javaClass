package Parte4;

public class App4 {
    public static void main(String[] args) {
    
        Animal1[] animeles = { new Perro(), new Gato(), new Animal1()};
        for (Animal1 animal1 : animeles) {
            animal1.hacerSonido();
        }
        /*
        Perro pelusa = new Perro();
        pelusa.hacerSonido();
        Gato blanca = new Gato();
        blanca.hacerSonido();
        */

    }

}
