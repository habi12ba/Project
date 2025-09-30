package direction;

import rover.Rover;

public class North implements Direction {
    @Override public void move(Rover r) { r.setPosition(r.getX(), r.getY() + 1); }
    @Override public Direction left() { return new West(); }
    @Override public Direction right() { return new East(); }
    @Override public String name() { return "North"; }
}
