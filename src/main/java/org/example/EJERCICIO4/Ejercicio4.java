package org.example.EJERCICIO4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Ejercicio4 {
    public static void main(String[] args) {

        //creacion de libros (4)
        Supplier<List<Libros>> listaLibros = () -> {
            List<Libros> libros = new ArrayList<>();
            libros.add(new Libros("Los ojos del perro siberiano", "Antonio Santa Ana", 10.0));
            libros.add(new Libros("Ojitos de angel", "Ramón Fonseca Mora", 8.5));
            libros.add(new Libros("La isla del tesoro", "Robert Louis Stevenson", 7.2));
            libros.add(new Libros("El caballero de la armadura oxidada", "Robert Fisher", 1.6));
            return libros;
        };

        //Convertir el supplier en lista
        List<Libros> libros = listaLibros.get();

        //predicate para determinar los libros puntuados iguales o mayores de 7
        Predicate<Libros> librosPuntaje = x -> x.getPuntaje() >= 7.0;


        //UnaryOperator para el mesanje de recomendacion
        UnaryOperator<Libros> mostrarMensaje = mensaje -> {
            String Mensaje = "\nEl libro "+ mensaje.getNombre()+ " Es recomendado smile";
            System.out.println(Mensaje);
            return mensaje;
        };


        //Consumer para consumir la lista y mostrar el mensaje de UnaryOperator
        Consumer<List<Libros>> CListaLibros = lista -> {
            libros.forEach(libro -> {
                if (librosPuntaje.test(libro)){
                    mostrarMensaje.apply(libro);
                }
            });
        };

        //usamos el consumer
        CListaLibros.accept(libros);

    }
}
