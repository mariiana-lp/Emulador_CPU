package main;

import java.util.List;

public class Registro{
    String nombre_regristo;
    int valor;

    public Registro(String nombre_regristo, int valor) {
        this.nombre_regristo = nombre_regristo;
        this.valor = valor;
    }

    public Registro(){
        nombre_regristo ="";
        valor = 0;
    }

    public String getNombre_regristo() {
        return nombre_regristo;
    }

    public void setNombre_regristo(String nombre_regristo) {
        this.nombre_regristo = nombre_regristo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
