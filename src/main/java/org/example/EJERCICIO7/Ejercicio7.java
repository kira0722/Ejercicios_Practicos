package org.example.EJERCICIO7;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;
import java.util.function.Function;

public class Ejercicio7 {
    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2010, 3, 12));
        dates.add(LocalDate.of(2005, 8, 21));
        dates.add(LocalDate.of(2016, 1, 2));
        dates.add(LocalDate.of(2007, 12, 1));
        dates.add(LocalDate.of(2001, 4, 19));

        dates.forEach(Ejercicio7::message);

    }

    public static void message (LocalDate date) {
        String dia = String.valueOf(date.getDayOfMonth());
        String mes = String.valueOf(date.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES"))); // el mensaje de deprated es por el Locale que ya no esta soportado desde la version 19 de java
        String año = String.valueOf(date.getYear());

        System.out.println("La fecha es: " + dia + " de "  + " del "+ año);
    }

}
