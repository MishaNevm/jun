public abstract class Animal {
    private int weight;
    private int height;

    protected Animal(int weight, int height) {
        this.height = height;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void showInfo() {
        System.out.println(weight + "\n" + height);
    }
}
