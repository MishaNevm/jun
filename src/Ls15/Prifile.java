package Ls15;

import java.util.Scanner;

public class Prifile {
    Scanner scan = new Scanner(System.in);
    protected int age;
    public void setInfo (){
        System.out.print("Введите ваш возраст");
        age = scan.nextInt();
    }
}
