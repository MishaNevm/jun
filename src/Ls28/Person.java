package Ls28;

import java.io.*;

public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = -4859230257365037980L;

    public String name;
    public int id;

    public Person() {
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

