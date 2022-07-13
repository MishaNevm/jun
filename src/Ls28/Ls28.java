package Ls28;

import java.io.*;

public class Ls28 implements Serializable {
    public static void main(String[] args) {
        Person person1 = new Person("Misha", 1);
        Person.outPutPersonInFie(person1);
        Person person2 = Person.inPutPersonInFie("Misha", 1);
        System.out.println(person2.getName() +" "+ person2.getId());
    }


}
