package ls17num4;

public class Car {
    private String color;
    private String model;
    private int weight;

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {
        System.out.println("Объект класса Car создан");
    }

    public void setInfo(String color, String model, int weight) {
        this.color = color;
        this.weight = weight;
        this.model = model;
    }

    public String getInfo() {
        return color + "\n" + model + "\n" + weight;
    }
}
