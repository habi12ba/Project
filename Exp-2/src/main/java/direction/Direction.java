package direction;

import rover.Rover;

public interface Direction {
    void move(Rover rover);
    Direction left();
    Direction right();
    String name();
}
