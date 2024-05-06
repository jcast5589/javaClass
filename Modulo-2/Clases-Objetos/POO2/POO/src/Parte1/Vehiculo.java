package Parte1;


public class Vehiculo {

    private String color;
    private String modelo;

    public Vehiculo(String color, String modelo){
        this.color = color;
        this.modelo = modelo;
    }
    public Vehiculo(Vehiculo carro){
        this.color = carro.color;
    }


    public String getInfo(String modelo){
        return "color " + this.color +  "    " + "modelo    "  + modelo;
    }

    public String getInfo(){
        return "color " + this.color +  "    " + "modelo    "  + modelo;
    }


    public String getColor(){
        return this.color;
    }
}


