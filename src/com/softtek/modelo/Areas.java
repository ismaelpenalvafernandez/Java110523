package com.softtek.modelo;

public class Areas {
    float alto;
    float ancho;
    float radio;

    public Areas(float alto, float ancho, float radio) {
        this.alto = alto;
        this.ancho = ancho;
        this.radio = radio;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void areaRectangulo(){
        System.out.println("El area del rectagulo es " + this.ancho + this.alto);
    }
    public void areaCirculo(){
        System.out.println("El area del circulo es " + Math.PI * Math.pow(this.radio, 2));
    }
}
