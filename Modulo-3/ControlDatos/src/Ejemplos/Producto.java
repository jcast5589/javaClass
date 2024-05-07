package Ejemplos;

public class Producto {
    String codigo;
    int cantidad;
    int stock;

    public Producto(String codigo, int cantidad, int stock) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.stock = stock;
    }


    public int getCantidad() {
        return cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString(){
        return "Prodcto: " + codigo + "\tCantidad: "+ cantidad + "\tStock: " +  stock;
    }
}
