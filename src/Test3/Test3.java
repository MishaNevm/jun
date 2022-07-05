package Test3;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            File file = new File("Test.txt");
            if (file.exists()) {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter("Test.txt");
            pw.println("File create");
            br = new BufferedReader(new FileReader("Test.txt"));
            String test = br.readLine();
            System.out.println(test);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
