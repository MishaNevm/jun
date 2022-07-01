import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
File fileKorgi = new File("Korgi");
File fileLabrador = new File("Labrador");
        Scanner scanKorgi = new Scanner(fileKorgi);
        Scanner scanLabro = new Scanner(fileLabrador);
        String korg = scanKorgi.nextLine();
        String labr = scanLabro.nextLine();
        String [] Korgi = korg.split(" ");
        String [] Labrador = labr.split(" ");
        Dog korgi = new Dog(Integer.parseInt(Korgi[0]), Integer.parseInt(Korgi[1]), Korgi[2]);
        Dog labrodor = new Dog(Integer.parseInt(Labrador[0]), Integer.parseInt(Labrador[1]), Labrador[2]);
        List <Dog> dogsList = new ArrayList<>();
        dogsList.add(korgi);
        dogsList.add(labrodor);
        getInfoFromList(dogsList);
    }
    public static void getInfoFromList (List<? extends Animal> list){
        for (Animal dog : list){
            dog.showInfo();
        }
    }
}
