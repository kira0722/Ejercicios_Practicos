package org.example.EJERCICIO9;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ejercicio9 {
    public static void main(String[] args) {
        List<String> result = filterNames("carlos");
        System.out.println("el resultado de la busqueda es: \n");
        printName(result);

    }

    private static final List<String> names = Arrays.asList("carlos", "juan", "jane");

    public static List<String> filterNames(String findName){
        return names.stream()
                .filter(name -> name.equals(findName))
                .collect(Collectors.toList());
    }

    public static void printName(List<String> filterNames){
        Optional.ofNullable(filterNames)
                .ifPresent(list -> list.forEach(System.out::println));
    }


}
