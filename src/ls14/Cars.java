package ls14;

public class Cars {
    public int weight;
    public String model;
    public char color;
    public float speed;


    public String outPut () {
        return "Вес " + model + " составляет " + weight + "кг." + "Цвет машины - " + color + " и её скорость - " + speed;
    }

    public Cars (int weight, String model, char color, float speed) {
        this.weight = weight;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
}

