import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dog extends Animal {
    private String color;
    private String [] allInfoFromBlank = new String[3];
    public Dog(int weight, int height, String color) {
        super(weight, height);
        this.color = color;
    }

    public Dog() {
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setAllInfoFromFile (File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        int i = 0;
        while (scan.hasNextLine()){
            allInfoFromBlank[i] = scan.nextLine();
            i++;
        }
        setWeight(Integer.parseInt(allInfoFromBlank[0]));
        setHeight(Integer.parseInt(allInfoFromBlank[1]));
        color = allInfoFromBlank[2];
    }

    @Override
    public void showInfo() {
        System.out.println(getHeight() + "\n" + getWeight() + "\n" + color);
    }

}
