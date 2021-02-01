import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtle.PenOrientation;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {

    Turtle turtle;
    Pen pen;

    @BeforeEach
    void setUp() {
        pen = new Pen();
        turtle = new Turtle(pen);
    }

    @AfterEach
    void tearDown() {
        turtle = null;
    }

    @Test
    void turtle_hasAPen() {
        assertNotNull(turtle.getPen());
    }

    @Test
    void turtlePenIsUp() {
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        PenOrientation actual = turtle.getPen().getPenOrientation();
        assertEquals(PenOrientation.PEN_UP, actual);
    }

    @Test
    void turtlePenIsDown() {
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        PenOrientation actual = turtle.getPen().getPenOrientation();
        assertEquals(PenOrientation.PEN_DOWN, actual);
    }

    @Test
    void turtle_canTurnRight() {
        turtle.setCurrentDirection(Direction.EAST);
        turtle.turnRight();
        Direction actual = turtle.getCurrentDirection();
        assertEquals(Direction.SOUTH, actual);

        turtle.setCurrentDirection(Direction.SOUTH);
        turtle.turnRight();
        assertEquals(Direction.WEST, turtle.getCurrentDirection());

        turtle.setCurrentDirection(Direction.WEST);
        turtle.turnRight();
        assertEquals(Direction.NORTH, turtle.getCurrentDirection());

        turtle.setCurrentDirection(Direction.NORTH);
        turtle.turnRight();
        assertEquals(Direction.EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtle_canTurnLeft() {
        turtle.setCurrentDirection(Direction.EAST);
        turtle.turnLeft();
        Direction actual = turtle.getCurrentDirection();
        assertEquals(Direction.NORTH, actual);

        turtle.setCurrentDirection(Direction.SOUTH);
        turtle.turnLeft();
        assertEquals(Direction.EAST, turtle.getCurrentDirection());

        turtle.setCurrentDirection(Direction.WEST);
        turtle.turnLeft();
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());

        turtle.setCurrentDirection(Direction.NORTH);
        turtle.turnLeft();
        assertEquals(Direction.WEST, turtle.getCurrentDirection());
    }

    @Test
    void turtle_canMoveEastward_SketchPad_whilePenUp(){
        SketchPad sketchBoard = new SketchPad();
        int numberOfSteps = 5;
        turtle.move(sketchBoard, numberOfSteps);
        

    }
}