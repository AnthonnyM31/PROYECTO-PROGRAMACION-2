package PROYECTO;

import java.util.Arrays;

public class Inventario {



    private int cantidad;
    private String nombre;
    private double precio;


    public Inventario() {}

    public Inventario(String nombre, int cantidad, double precio) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getnombreSnack() {
        return nombre;
    }

    public void setnombreSnack(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        System.out.println();
        return nombre + "'\n''" +
                ", cantidad snack=' " + cantidad + "  -----------  " +
                ", precio snack= " + precio + "'";
    }

}
