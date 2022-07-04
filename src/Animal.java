public abstract class Animal {
    private int weight;
    private int height;

    protected Animal(int weight, int height) {
        this.height = height;
        this.weight = weight;
    }

    protected Animal() {
    }

    protected int getWeight() {
        return weight;
    }

    protected int getHeight()
    {
        return height;
    }

    public abstract void showInfo();
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setHeight(int height){
        this.height = height;
    }

}
