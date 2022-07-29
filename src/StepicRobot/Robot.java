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
            case UP: {
                dr = Direction.LEFT;
                break;
            }
            case DOWN: {
                dr = Direction.RIGHT;
                break;
            }
            case LEFT: {
                dr = Direction.DOWN;
                break;
            }
            case RIGHT: {
                dr = Direction.UP;
                break;
            }
        }
    }

    public void turnRight() {
        System.out.println("Поворот по часов стрелке на 90 градусов");
        switch (dr) {
            case DOWN: {
                dr = Direction.LEFT;
                break;
            }
            case UP: {
                dr = Direction.RIGHT;
                break;
            }
            case RIGHT: {
                dr = Direction.DOWN;
                break;
            }
            case LEFT: {
                dr = Direction.UP;
                break;
            }
        }
    }

    public void stepForward() {
        switch (dr) {
            case LEFT: {
                X -= 1;
                break;
            }
            case RIGHT: {
                X += 1;
                break;
            }
            case UP: {
                Y += 1;
                break;
            }
            case DOWN: {
                Y -= 1;
                break;
            }
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
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
        for (int i = 0; i < toX; i++){
            robot.stepForward();
        }
    }
}
