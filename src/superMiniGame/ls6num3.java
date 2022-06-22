package superMiniGame;


import java.util.Random;
import java.util.Scanner;

public class ls6num3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int ran = rand.nextInt(20 - 1 + 1) + 1;
        System.out.print("Попробуйте угадать число от 1 до 20: ");
        int num = scan.nextInt();
        while (num != ran) {
            if (num > ran) {
                System.out.print("Число которое вы угадываете меньше: ");
            } else System.out.print("Число которое вы угадываете больше: ");
            num = scan.nextInt();
        }
        System.out.println("Вы угадали, это число: " + ran);
    }
}
