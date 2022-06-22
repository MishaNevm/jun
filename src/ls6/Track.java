package ls6;

public class Track extends Cars {
    private int wheels;
    private int maxWeight;

    public Track(int weight, String model, char color, float speed, int wheels, int maxWeight) {
        this.weight = weight;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }

    public void setWheels (int wheels) {
        this.wheels = wheels;
        System.out.println("Новое значение wheels = " + wheels);
    }

}


