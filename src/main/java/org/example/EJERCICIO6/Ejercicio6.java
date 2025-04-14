package org.example.EJERCICIO6;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Ejercicio6 {
    public static void main(String[] args) {

    Datos datos = (name, age, birthday) -> {

        BiFunction<Integer, LocalDate, Boolean> validateAge = (R, birth) -> {
            int agec = Period.between(birth, LocalDate.now()).getYears();
            return  R == agec;
        };

        Boolean Validate = validateAge.apply(age, birthday);

        return "La fecha de nacimiento de: "+ name + (Validate ? " corresponde" : " no corresponde") + " a la edad ingresada";
    };
    System.out.println();

    String message = datos.mensaje("Carlitos", 21, LocalDate.of(2004, 7, 22));
        System.out.println(message);

    }

    @FunctionalInterface
    interface Datos {
        String mensaje(String name, Integer age, LocalDate birthday);
    }
}
