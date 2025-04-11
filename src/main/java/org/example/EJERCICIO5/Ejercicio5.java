package org.example.EJERCICIO5;

import java.math.BigDecimal;
import java.util.function.BinaryOperator;

public class Ejercicio5 {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal(99);
        BigDecimal num2 = new BigDecimal(5);

        BinaryOperator<BigDecimal> div = BigDecimal::divide;

        BigDecimal result = div.apply(num1, num2);
        System.out.println("El resultado de la division es: " + result);

    }
}
