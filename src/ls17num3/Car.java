package ls17num3;

public class Car {
    private int weight;
    String color;
    String name;

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {
    }
    public void setInfo(String name, String color, int weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    public String getInfo(){
        return name + " " + color + " " + weight;
    }
}
