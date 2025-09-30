package direction;

import rover.Rover;

public class West implements Direction {
    @Override public void move(Rover r) { r.setPosition(r.getX() - 1, r.getY()); }
    @Override public Direction left() { return new South(); }
    @Override public Direction right() { return new North(); }
    @Override public String name() { return "West"; }
}
