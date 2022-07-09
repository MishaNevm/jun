package Ls27;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public abstract class Auto {
    Scanner scan = new Scanner(System.in);
    protected static int idStatic = 1;
    protected int id;
    protected String brand;
    protected String model;
    protected String color;
    protected int year;
    protected String bodyType;
    protected String transmission;
    protected File CarsDir;
    File file;
    PrintWriter pw;
    public Auto(String brand, String model) {
        id = idStatic;
        idStatic++;
        Motor motor = new Motor();
        CarsDir = new File("Cars");
        CarsDir.mkdir();
    }

    public void setInfo() {
        System.out.print("Введите цвет авто: ");
        color = scan.nextLine();
        System.out.print("Введите тип кузова: ");
        bodyType = scan.nextLine();
        System.out.print("Введите год впуска: ");
        year = scan.nextInt();
        setTransmission();
    }

    public void setTransmission() {
        boolean a = true;
        while (a) {
            a = false;
            System.out.println("Укажите коробку предачь: ");
            System.out.println("1 - Механическая");
            System.out.println("2 - Автоматическая");
            System.out.println("3 - Робот");
            System.out.println("4 - Вариатор");
            System.out.print("Выберите один из вариантов: ");
            int type = scan.nextInt();
            switch (type) {
                case 1: {
                    transmission = "Механическая";
                    break;
                }
                case 2: {
                    transmission = "Автоматическая";
                    break;
                }
                case 3: {
                    transmission = "Робот";
                    break;
                }
                case 4: {
                    transmission = "Вариатор";
                    break;
                }
                default: {
                    System.out.println("Произошла ошибка ввода");
                    a = true;
                }
            }
        }

    }
    public int getId() {
        return id;
    }

    class Motor {
        private int cylinders;
        private int power;
        private int volum;

        public void setMotorInfo(int cylinders, int power, int volum) {
            this.cylinders = cylinders;
            this.power = power;
            this.volum = volum;
        }

    }
}
