package AutoRuMyVersion;


import java.io.*;

public class Main implements Serializable {
    public static void main(String[] args) {
        // Зайди в класс юзер
        DailyCar toyota = new DailyCar("Toyota", "GT86");
        DailyCar.outputDilyCar(toyota);
        DailyCar toyotaTest = DailyCar.inputDailyCar("Toyota","GT86",1);
    }
}
