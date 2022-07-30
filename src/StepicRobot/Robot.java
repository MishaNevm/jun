package StepicRobot;

import static StepicRobot.Direction.*;

public class Robot {
    Direction dr;
    int y;
    int x;

    public Robot() {
        dr = UP;
        y = 0;
        x = 0;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public Direction getDr() {
        return dr;
    }

    public void turnLeft() {
        if (dr == UP) {
            dr = LEFT;
        } else if (dr == LEFT) {
            dr = DOWN;
        } else if (dr == DOWN) {
            dr = RIGHT;
        } else dr = UP;
    }

    public void turnRight() {
        if (dr == UP) {
            dr = RIGHT;
        } else if (dr == LEFT) {
            dr = UP;
        } else if (dr == DOWN) {
            dr = LEFT;
        } else dr = DOWN;
    }

    public void stepForward() {
        if (dr == UP) {
            y++;
        } else if (dr == LEFT) {
            x--;
        } else if (dr == DOWN) {
            y--;
        } else x++;
    }

    public static void turnToRight(Robot robot) {
        if (robot.getDr() == UP) {
            robot.turnRight();
        } else if (robot.getDr() == DOWN) {
            robot.turnLeft();
        } else if (robot.getDr() == LEFT) {
            while (robot.getDr() != RIGHT) {
                robot.turnRight();
            }
        }
    }

    public static void turnToLeft(Robot robot) {
        if (robot.getDr() == UP) {
            robot.turnLeft();
        } else if (robot.getDr() == RIGHT) {
            while (robot.getDr() != LEFT) {
                robot.turnLeft();
            }
        } else if (robot.getDr() == DOWN) {
            robot.turnRight();
        }
    }

    public static void turnToUP(Robot robot) {
        if (robot.getDr() == RIGHT) {
            robot.turnLeft();
        } else if (robot.getDr() == DOWN) {
            while (robot.getDr() != UP) {
                robot.turnLeft();
            }
        } else if (robot.getDr() == LEFT) {
            robot.turnRight();
        }
    }

    public static void turnToDown(Robot robot) {
        if (robot.getDr() == LEFT) {
            robot.turnLeft();
        } else if (robot.getDr() == UP) {
            while (robot.getDr() != DOWN) {
                robot.turnLeft();
            }
        } else if (robot.getDr() == RIGHT) {
            robot.turnRight();
        }
    }


    public static void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        if (x != toX && y != toY) {
            if (x > toX){
                turnToLeft(robot);
                for (;x > toX; x--){
                    robot.stepForward();
                }
            } else {
                turnToRight(robot);
                for (;x < toX;x++){
                    robot.stepForward();
                }
            }
            if (y > toY){
                turnToDown(robot);
                for (; y > toY; y--){
                    robot.stepForward();
                }
            } else {
                turnToUP(robot);
                for (; y < toY; y++){
                    robot.stepForward();
                }
            }
        }
    }
}
