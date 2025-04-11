package org.example.EJERCICIO2;

import java.util.function.Function;

public class Ejercicio2 {
    public static void main(String[] args) {
        Function<Double, Double> potencia = (x -> Math.pow(x, 2));
        System.out.println("El resultado de la potencia es: " +potencia.apply(2.0));
    }
}
