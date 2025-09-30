package grid;

import rover.exception.OutOfBoundsException;

public class Cell extends GridComponent {
    private final int width, height;
    public Cell(int width, int height) { this.width = width; this.height = height; }

    @Override public void validate(int x, int y) throws OutOfBoundsException {
        if (!(x >= 0 && y >= 0 && x < width && y < height)) {
            throw new OutOfBoundsException("Position (" + x + "," + y + ") outside grid bounds [" + width + "x" + height + "]");
        }
    }
}
