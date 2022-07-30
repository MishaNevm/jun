package StepicRobot;

public class St1 {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Robot.moveRobot(robot, 10, 44);
        System.out.println(robot.getX() + " " + robot.getY());
        Robot.moveRobot(robot, 15, 56);
        System.out.println(robot.getX() + " " + robot.getY());
        Robot.moveRobot(robot, 5, -1);
        System.out.println(robot.getX() + " " + robot.getY());
        Robot.moveRobot(robot, 100, 111);
        System.out.println(robot.getX() + " " + robot.getY());
        Robot.moveRobot(robot, -100, -111);
        System.out.println(robot.getX() + " " + robot.getY());
    }
}
