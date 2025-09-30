package grid;

import rover.exception.ObstacleException;

public class Obstacle extends GridComponent {
    private final int ox, oy;
    public Obstacle(int x, int y) { this.ox = x; this.oy = y; }

    @Override public void validate(int x, int y) throws ObstacleException {
        if (x == ox && y == oy) {
            throw new ObstacleException("Obstacle at (" + x + "," + y + ")");
        }
    }
}
