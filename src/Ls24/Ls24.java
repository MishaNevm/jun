package Ls24;

import java.lang.NumberFormatException;
import java.util.Scanner;

public class Ls24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                if (Integer.parseInt(scan.nextLine()) != 0) {
                    throw new ScannerException();
                }
            } catch (ScannerException e) {
                System.out.println("Hehe hoho");
            } catch (NumberFormatException n) {
                System.out.println("Hoho hehe");
            }

        }
    }
}
