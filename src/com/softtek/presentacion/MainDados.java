package com.softtek.presentacion;

import com.softtek.modelo.Dados;

import java.util.Scanner;

public class MainDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Dados dados = new Dados();
        dados.lanzardados();
        String continuar;
        do {
            System.out.println("¿Quieres lanzar el dado de nuevo? (s/n)");
            continuar = teclado.next();

            if (continuar.equals("s")) {
                dados.lanzardados();
            }
        } while (continuar.equals("s"));
        teclado.close();
    }
}
