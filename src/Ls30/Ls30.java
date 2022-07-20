package Ls30;

import java.util.Scanner;

public class Ls30 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String userName = testRec();
        System.out.println(userName);
    }

    public static String testRec() {
        String userName;

        System.out.print("Введите ваше имя:");
        userName = scan.nextLine();

        if (userName.isEmpty()) {
            userName = testRec();
        }
        return userName;
    }
}
