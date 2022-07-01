public class Dog extends Animal {
    private String color;
    public Dog(int weight, int height, String color) {
        super (weight, height);
        this.color = color;
    }
    public String getColor (){
        return color;
    }
    @Override
    public void showInfo () {
        System.out.println(getHeight()+"\n"+getWeight()+"\n"+color);
    }
    public static int getWeightFromFile () {
        return 1;
    }
}
