package org.example.EJERCICIO1;

import java.util.LinkedList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        String name = "Halo";
        String type = "action";

        List<String>user = new LinkedList<>();
        user.add("Kira2207");
        //Clase inmutable
        GamesImmutable gamesImmutable = new GamesImmutable(name, type, user);
        System.out.println("Informacion de la clase inmutable: "+ gamesImmutable);
        Inmutable(gamesImmutable);
        System.out.println("Informacion del mismo usuario despues de hacer uso del metodo: " + gamesImmutable);

        //clase mutable
        System.out.println("\n \n");
        System.out.println("-----------------------------------------------------");
        List<String>userM = new LinkedList<>();
        userM.add("Carlitos");
        GamesMutable gamesMutable = new GamesMutable(name, type, userM);
        System.out.println("Informacion de la clase mutable antes de modificar el usuario: " + gamesMutable);
        Mutable(gamesMutable);
        System.out.println("usuario modificado de la clase mutable: " + gamesMutable);


    }
    static void Inmutable(GamesImmutable gamesImmutable){
        List<String> user = gamesImmutable.getUsers();
        user.clear();
        user.add("inmutable1234");
    }

    static void Mutable(GamesMutable gamesMutable){
        List<String> user = gamesMutable.getUsersM();
        user.clear();
        user.add("Juanito");

    }
}
