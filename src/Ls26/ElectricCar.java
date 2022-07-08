package Ls26;

public class ElectricCar {
    private int id;
    // Вложенный класс
    private class Motor {
        public void startMotor() {
            System.out.println("Motor on car " + id + " is Starting");
        }

        public void checkMotor() {
            System.out.println("Motor on car " + id + " serviceable");
        }
    }

    Motor motor;
    // Статический вложенный класс
    public static class Battary {
        public void charge(){
            System.out.println("Bttery is charging");
        }
    }

    public ElectricCar(int id) {
        this.id = id;
        motor = new Motor();
    }

    public void Start() {
        motor.checkMotor();
        motor.startMotor();
        System.out.println("Car " + id + " is starting");
        final int x = 1;
        class SmthClass {
            public void smthMethod (){
                System.out.println(x +" "+ id);
            }
        }
    }

}
