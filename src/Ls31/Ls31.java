package Ls31;


public class Ls31 {
    public static void main(String[] args) {

        System.out.println("Hiiiii");
        Test test = new Test();
        test.start();
        Test test2 = new Test();
        test2.start();
        Thread test3 = new Thread(new Test2());
        test3.start();
        Thread test4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        });
        test4.start();
    }
}

class Test extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from my thread" + i);
        }
    }
}

class Test2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

