package ls6num2;

import java.util.Scanner;

public class ls6num2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сумму депозита: ");
        double dep = scan.nextInt();
        System.out.print("Введите срок депозита: ");
        int time = scan.nextInt();
        System.out.print("Введите процентную ставку: ");
        double stavka = scan.nextInt();
        double res = dep;
        for (int i = 1; i <= time; i++) {
            res += res * (stavka / 100);
            System.out.printf("\nПосле " + i + " лет, сумма составит: %.2f", res);
        }
        System.out.printf("\nВ итоге после " + time + "лет, сумма составит:  %.2f", res);
    }
}
