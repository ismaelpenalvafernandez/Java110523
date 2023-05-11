package com.softtek.modelo;

public class Campos {
    private int i;
    public Campos (int i) {
    this.i = i;
}
    public int muestra(){
        int total= this.i;
        return total;
    }
    public int incrementar(){
        int total = this.i++;
        return total;
    }
}
