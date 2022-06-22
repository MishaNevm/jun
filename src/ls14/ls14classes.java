package ls14;

public class ls14classes {
    public static void main(String[] args) {
        Track qwe = new Track(2000, "KAMAZ", 'b', 150, 6, 6000);
        qwe.setWheels(5);
        System.out.println(qwe.outPut());
    }
}
