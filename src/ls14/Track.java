package ls14;

public class Track extends Cars {
    private int wheels;
    private int maxWeight;

    public Track(int weight, String model, char color, float speed, int wheels, int maxWeight) {
        super(weight,model,color,speed);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }

    public void setWheels (int wheels) {
        this.wheels = wheels;
        System.out.println("Новое значение wheels = " + wheels);
    }

    @Override
    public String outPut() {
        System.out.print(super.outPut());
        return "\n"+ wheels + "\n" + maxWeight;

    }
}


