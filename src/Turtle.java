public class Turtle {
    private Pen pen;

    private Direction currentDirection;

    public Turtle(Pen pen) {
        this.pen = pen;
        this.currentDirection = Direction.EAST;
    }

    public Pen getPen() {
       return pen;
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void turnRight() {
        switch (currentDirection){
            case EAST -> setCurrentDirection(Direction.SOUTH);
            case SOUTH -> setCurrentDirection(Direction.WEST);
            case WEST -> setCurrentDirection(Direction.NORTH);
            case NORTH -> setCurrentDirection(Direction.EAST);
        }
    }

    public Direction getCurrentDirection() {
        return currentDirection;


    }

    public void turnLeft() {
        switch (currentDirection){
            case EAST -> setCurrentDirection(Direction.NORTH);
            case SOUTH -> setCurrentDirection(Direction.EAST);
            case WEST -> setCurrentDirection(Direction.SOUTH);
            case NORTH -> setCurrentDirection(Direction.WEST);
        }
    }

    public void move(SketchPad sketchBoard, int numberOfSteps) {
    }
}
