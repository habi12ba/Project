package rover;

import grid.Grid;
import direction.Direction;
import java.util.logging.Logger;
import rover.exception.OutOfBoundsException;
import rover.exception.ObstacleException;

public class Rover {
    private static final Logger logger = Logger.getLogger(Rover.class.getName());
    private int x;
    private int y;
    private Direction direction;
    private final Grid grid;

    public Rover(int x, int y, Direction dir, Grid grid) {
        this.x = x; this.y = y; this.direction = dir; this.grid = grid;
        logger.info("Initialized rover at (" + x + "," + y + ") facing " + dir.name());
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public Direction getDirection() { return direction; }

    public void setPosition(int nx, int ny) {
        try {
            grid.validate(nx, ny);
            x = nx; y = ny;
            logger.fine("Position set to (" + x + "," + y + ")");
        } catch (OutOfBoundsException | ObstacleException ex) {
            logger.warning(ex.getMessage());
        } catch (Exception ex) {
            logger.severe("Unexpected error during move: " + ex.getMessage());
        }
    }

    public void move() { direction.move(this); }
    public void turnLeft() { direction = direction.left(); logger.fine("Turned left. Now facing " + direction.name()); }
    public void turnRight() { direction = direction.right(); logger.fine("Turned right. Now facing " + direction.name()); }
    public String statusReport() { return "Rover is at (" + x + ", " + y + ") facing " + direction.name() + "."; }
}
