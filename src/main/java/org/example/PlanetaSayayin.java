package org.example;

public class PlanetaSayayin {
    public static void main(String[] args) {

        System.out.println("Dragon Ball");

        //creando un objeto de clase alta
        ClaseAlta guerrero1 = new ClaseAlta("vegeta",90,30,"Negro");
        guerrero1.pelear();
        //creando un objeto de case baja
        ClaseBaja guerrero2 = new ClaseBaja("Goku",80,25,"Negro");
        guerrero2.pelear();

    }
}