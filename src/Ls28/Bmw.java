package Ls28;

import java.util.ArrayList;

public enum Bmw {
    three("e30", "e34"), ;

    ArrayList <String> genertions = new ArrayList<>();

    private Bmw (String ... genertion) {
        genertions.add(String.valueOf(genertion));
    }

}
