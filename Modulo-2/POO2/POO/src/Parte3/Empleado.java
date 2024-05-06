package Parte3;

public class Empleado {

    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Métodos para obtener información
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    // Método para aumentar el salario
    public void aumentarSalario(double porcentaje) {
        salario += salario * (porcentaje / 100);
    }

}
