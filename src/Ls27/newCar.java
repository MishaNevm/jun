package Ls27;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class newCar extends Auto{
    File CarFile;
    String CarName;

    public newCar(String brand, String model) throws IOException {
        this.brand = brand;
        this.model = model;
        CarName = brand + "_" + model + "_" + getId() + ".txt";
        CarFile = new File(CarsDir + "\\" + CarName);
        CarFile.createNewFile();
        pw = new PrintWriter(CarFile);
        setInfo();
        motor.setMotorInfo();
        pw.println("Бренд: " + brand);
        pw.println("Модель: "+ model);
        pw.println("Цвет: " + color);
        pw.println("Год " + year);
        pw.println("Тип кузова: "+ bodyType);
        pw.println("Коробка передачь: " + transmission);
        pw.println("Объем двигателя: " + motor.getVolum());
        pw.println("Количество цилиндров: " + motor.getCylinders());
        pw.println("Мощноть: " + motor.getPower());
        pw.close();
        System.out.println("Файл " + CarName + " создан");
    }
}
