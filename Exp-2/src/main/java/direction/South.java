package direction;

import rover.Rover;

public class South implements Direction {
    @Override public void move(Rover r) { r.setPosition(r.getX(), r.getY() - 1); }
    @Override public Direction left() { return new East(); }
    @Override public Direction right() { return new West(); }
    @Override public String name() { return "South"; }
}
