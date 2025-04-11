package org.example.EJERCICIO1;

import java.util.LinkedList;
import java.util.List;

public class GamesImmutable {
    private final String name;
    private final String type;
    private List<String> users;

    public GamesImmutable(String name, String type, List<String> users) {
        this.name = name;
        this.type = type;
        this.users = new LinkedList<>(users);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public final List<String> getUsers(){
        return new LinkedList<>(users);
    }

    @Override
    public String toString() {
        return "Games{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", users=" + users +
                '}';
    }
}
