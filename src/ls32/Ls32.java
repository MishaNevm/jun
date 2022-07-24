package ls32;

public class Ls32 {
    public static void main(String[] args) {
        some(123);
        some ("some String");
        some('c');
    }

    public static <T> void some(T a) {
        Thread one = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(a);
            }
        });
        one.start();
    }
}

