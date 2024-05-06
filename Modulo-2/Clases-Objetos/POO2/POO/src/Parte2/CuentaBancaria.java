package Parte2;

public class CuentaBancaria {
    
    //Privados
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    

    public String getTitular(){
        return this.titular;
    }

    public void depositar(double monto){
        this.saldo += monto;  //Saldo = saldoAnterior + monto
    }
}
