package Ls20;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ls20 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator+"C:"+separator+"Users"+separator+"Админ"+separator+"Desktop"+separator+"Test.txt";
        File file = new File(path);

        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        scan.close();
    }
}

