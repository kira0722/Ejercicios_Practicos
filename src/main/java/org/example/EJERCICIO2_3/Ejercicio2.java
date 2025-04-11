package org.example.EJERCICIO2_3;

import java.util.function.Function;
import java.util.function.Predicate;

public class Ejercicio2 {
    public static void main(String[] args) {
        Double number = 4.0;
        Double potenciaNumber = 4.0;
        Function<Double, Double> potencia = (x -> Math.pow(x, potenciaNumber));
        Predicate<Double> ParOImpar = (x -> x % 2 == 0);

        Double resultado = potencia.apply(number);
        System.out.println("El resultado de la potencia es: " + resultado);

        if (ParOImpar.test(resultado)){
            System.out.println("\nEl resultado de la potencia es par: " + resultado);
        }else {
            System.out.println("\nEl resultado de la potencia es impar: " + resultado);
        }

    }
}
