package org.example;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;

public abstract class Sayayin {
    private String nombre;
    private Integer poderPelea;
    private Integer edad;
    private String colorPelo;

    public Sayayin() {
    }

    public Sayayin(String nombre, Integer poderPelea, Integer edad, String colorPelo) {
        this.nombre = nombre;
        this.poderPelea = poderPelea;
        this.edad = edad;
        this.colorPelo = colorPelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPoderPelea() {
        return poderPelea;
    }

    public void setPoderPelea(Integer poderPelea) {
        this.poderPelea = poderPelea;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public void comer(){
        System.out.println("Hola soy sayayin y como mucho");
    }

    //metodo para declarar una clase abstracta no se implementa solo se declara
    public abstract void pelear();
}
