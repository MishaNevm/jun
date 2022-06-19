package num13;

public class ls5num13 {
    public static void main(String[] args) {
        int i = -7;
        do {
            if (i != -1 && i != 5 && i != 11) {
                System.out.println(i);
            }
            i += 3;
        } while (i < 12);
    }
}

