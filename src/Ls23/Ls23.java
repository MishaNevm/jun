package Ls23;

import java.io.*;
import java.util.Arrays;

public class Ls23 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            File file = new File("Test.txt");
            if (file.exists()) {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.println("All working");
            pw.println("Hello");
            pw.close();

            br = new BufferedReader(new FileReader("Test.txt"));
            String[] line = new String[2];
            for (int i = 0; i < line.length; i++){
                line[i] = br.readLine();
            }
            System.out.println(line[0]);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}