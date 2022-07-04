package Ls22;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ls22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        try {
            int i = scan.nextInt();
        } catch (InputMismatchException e){
            System.out.print("Необходимо ввести число");
        }
    }
}
