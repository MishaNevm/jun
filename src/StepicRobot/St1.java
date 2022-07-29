package StepicRobot;

public class St1 {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Robot.moveRobot(robot, 10,44);
        System.out.println(robot.getX() + " " + robot.getY());
        Robot.moveRobot(robot, 15,56);
        System.out.println(robot.getX() + " " + robot.getY());
        Robot.moveRobot(robot, -2,-3);
        System.out.println(robot.getX() + " " + robot.getY());
    }
}
