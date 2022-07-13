package AutoRuMyVersion;


import java.io.*;
import java.util.Locale;

public class DailyCar extends Auto implements Serializable {
    @Serial
    private static final long serialVersionUID = -8651391768980702961L;
    String CarName;
    private static File dailyDir = new File("daylyDir");
    private static String separator = File.separator;

    public DailyCar(String brand, String model) {
        this.brand = brand;
        this.model = model;
        CarName = brand + "_" + model + "_" + getId() + ".bin";
        System.out.println("Автомобиль добавлен");
    }

    public String getCarName() {
        return CarName;
    }

    public static void outputDilyCar(DailyCar dc) {
        dailyDir.mkdir();
        File daylyCar = new File(dailyDir + separator + dc.getCarName());
        if (daylyCar.exists()) {
            try {
                daylyCar.createNewFile();
            } catch (IOException e) {
                System.out.println("Error 200");
            }
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(daylyCar))) {
            oos.writeObject(dc);
        } catch (IOException e) {
            System.out.println("Error 201");
        }
    }

    public static DailyCar inputDailyCar(String brand, String model, int id) {
        dailyDir.mkdir();
        String fileName = brand + "_" + model + "_" + id + ".bin";
        DailyCar dc = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream
                (dailyDir + separator + fileName))) {
            dc = (DailyCar) ois.readObject();
        } catch (IOException e) {
            System.out.println("Error 202");
            return dc;
        } catch (ClassNotFoundException e) {
            System.out.println("Error 203");
            return dc;
        }
        return dc;
    }
}
