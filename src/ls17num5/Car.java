package ls17num5;

public class Car {
    private char color;
    private String model;
    private int weight;
    private int speed;

    public Car(char color) {
        this.color = color;
    }

    public Car(char color, int weight, String model, int speed) {
        this.color = color;
        this.weight = weight;
        this.speed = speed;
        this.model = model;
    }

    public Car() {
        System.out.println("Объект класса Car создан");
    }

    public void setInfo(char color, String model, int weight) {
        this.color = color;
        this.weight = weight;
        this.model = model;
    }

    public String getInfo() {
        return color + "\n" + model + "\n" + weight + "\n" + speed;
    }
}
