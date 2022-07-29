package StepicRobot;

public class Robot {
    Direction dr = Direction.UP;
    int X = 0;
    int Y = 0;

    public Direction getDirection() {
        return dr;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void turnLeft() {
        System.out.println("Поворот против часовой стрелки на 90 градусов");
        switch (dr) {
            case UP -> dr = Direction.LEFT;
            case DOWN -> dr = Direction.RIGHT;
            case LEFT -> dr = Direction.DOWN;
            case RIGHT -> dr = Direction.UP;
        }
    }

    public void turnRight() {
        System.out.println("Поворот по часов стрелке на 90 градусов");
        switch (dr) {
            case DOWN -> dr = Direction.LEFT;

            case UP -> dr = Direction.RIGHT;

            case RIGHT -> dr = Direction.DOWN;

            case LEFT -> dr = Direction.UP;
        }
    }

    public void stepForward() {
        switch (dr) {
            case LEFT -> X--;
            case RIGHT -> X++;
            case UP -> Y++;
            case DOWN -> Y--;
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() == toY) {
            System.out.println("Уже на месте");
            return;
        }
        moveX(robot, toX);
        moveY(robot, toY);
    }

    public static void moveX(Robot robot, int toX) {
        if (robot.getX() != toX) {
            if (toX > 0) {
                if (robot.getDirection() != Direction.RIGHT) {
                    switch (robot.getDirection()) {
                        case UP: {
                            robot.turnRight();
                            break;
                        }
                        case DOWN: {
                            robot.turnLeft();
                        }
                        case LEFT: {
                            while (robot.getDirection() != Direction.RIGHT)
                                robot.turnRight();
                        }
                    }
                }
            } else if (toX < 0) {
                if (robot.getDirection() != Direction.LEFT) {
                    switch (robot.getDirection()) {
                        case UP: {
                            robot.turnLeft();
                            break;
                        }
                        case DOWN: {
                            robot.turnRight();
                        }
                        case RIGHT: {
                            while (robot.getDirection() != Direction.LEFT)
                                robot.turnLeft();
                        }
                    }
                }
            }
            if (robot.getX() > toX) {
                for (int i = robot.getX(); i > toX; i--) {
                    robot.stepForward();
                }
            } else {
                for (int i = robot.getX(); i < toX; i++) {
                    robot.stepForward();
                }
            }
        }
    }

    public static void moveY(Robot robot, int toY) {
        if (robot.getY() != toY) {
            if (toY > 0) {
                if (robot.getDirection() != Direction.UP) {
                    switch (robot.getDirection()) {
                        case LEFT: {
                            robot.turnRight();
                            break;
                        }
                        case RIGHT: {
                            robot.turnLeft();
                        }
                        case DOWN: {
                            while (robot.getDirection() != Direction.UP)
                                robot.turnRight();
                        }
                    }
                }
            } else if (toY < 0) {
                if (robot.getDirection() != Direction.DOWN) {
                    switch (robot.getDirection()) {
                        case RIGHT: {
                            robot.turnLeft();
                            break;
                        }
                        case LEFT: {
                            robot.turnRight();
                        }
                        case UP: {
                            while (robot.getDirection() != Direction.LEFT)
                                robot.turnRight();
                        }
                    }
                }
            }
            if (robot.getY() > toY) {
                for (int i = robot.getY(); i > toY; i--) {
                    robot.stepForward();
                }
            } else {
                for (int i = robot.getY(); i < toY; i++) {
                    robot.stepForward();
                }
            }
        }
    }
}
