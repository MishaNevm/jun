package Practic3;

public interface Test {
    public default <T> void test (T e) {
        System.out.println(e);
    }
}
