package Ls28;
import java.io.*;
public class Ls28 implements Serializable {
    public static void main(String[] args) {
        Person person1 = new Person("Misha", 1);
        outPutPersonInFie(person1);
        Person person2 = inPutPersonInFie("Misha",1);
        System.out.println(person2.getName() + person2.getId());
    }
    public static void outPutPersonInFie(Person person) {
        File dir = new File("TestDir2");
        dir.mkdir();
        String sepor = File.separator;
        File file = new File(dir + sepor + person.getName() + person.getId() + ".bin");
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(person);
        } catch (FileNotFoundException e) {
            System.out.println("Error 201");
        } catch (IOException e) {
            System.out.println("Error 202");
        }
    }

    public static Person inPutPersonInFie(String userName, int userId) {
        File dir = new File("TestDir2");
        dir.mkdir();
        String sepor = File.separator;
        File file = new File(dir + sepor + userName + userId + ".bin");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Person person = (Person) ois.readObject();
            return person;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error 301");
            Person pust = new Person();
            return pust;
        }
    }
}
