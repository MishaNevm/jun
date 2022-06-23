package ls17num3;

public class ls17num3 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.setInfo("bmw","white",1200);
        car2.setInfo("Mercedes","black",1500);
        System.out.println(car1.getInfo());
        System.out.println(car2.getInfo());
    }
}
