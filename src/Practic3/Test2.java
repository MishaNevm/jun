package Practic3;

public interface Test2 extends Test {
    default <T> void test (T e){
        System.out.println(e + " " + 1);
    }
}
