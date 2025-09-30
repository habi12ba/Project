package direction;

import rover.Rover;

public class East implements Direction {
    @Override public void move(Rover r) { r.setPosition(r.getX() + 1, r.getY()); }
    @Override public Direction left() { return new North(); }
    @Override public Direction right() { return new South(); }
    @Override public String name() { return "East"; }
}
