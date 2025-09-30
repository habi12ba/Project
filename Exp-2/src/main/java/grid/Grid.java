package grid;

import java.util.ArrayList;
import java.util.List;

public class Grid extends GridComponent {
    private final List<GridComponent> components = new ArrayList<>();

    public void add(GridComponent c) { components.add(c); }

    @Override public void validate(int x, int y) throws Exception {
        for (GridComponent c : components) {
            c.validate(x, y);
        }
    }
}
