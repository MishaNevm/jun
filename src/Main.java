import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File fileKorg = new File("Korgi");
        File fileLabro = new File("Labrador");
       Dog korgi = new Dog();
       korgi.setAllInfoFromFile(fileKorg);
       korgi.showInfo();
       Dog labrodor = new Dog();
       labrodor.setAllInfoFromFile(fileLabro);
       labrodor.showInfo();
    }
}
