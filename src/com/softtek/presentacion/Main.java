package com.softtek.presentacion;


import com.softtek.modelo.Campos;
public class Main {
    public static void main(String[] args){
         Campos num = new Campos(10);

        System.out.println( num.muestra());
        num.incrementar();
        num.incrementar();
        System.out.println(num.muestra());
    }
}
