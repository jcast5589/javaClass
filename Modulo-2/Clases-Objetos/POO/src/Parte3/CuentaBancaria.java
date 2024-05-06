package Parte3;

public class CuentaBancaria {
    // Atributos privados
    private String titular;
    private double saldo;

    // Constructor para inicializar
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para obtener el titular
    public String getTitular() {
        return titular;
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        saldo += monto;
    }
}
