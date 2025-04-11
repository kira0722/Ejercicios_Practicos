package org.example.EJERCICIO1;

import java.util.List;

public class GamesMutable {
    private final String name;
    private final String type;
    List<String> usersM;

    public GamesMutable(String name, String type, List<String> usersM) {
        this.name = name;
        this.type = type;
        this.usersM = usersM;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public List<String> getUsersM() {
        return usersM;
    }

    @Override
    public String toString() {
        return "GamesMutable{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", usersM=" + usersM +
                '}';
    }
}
