import java.util.ArrayList;
import java.util.List;

// Composite
public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void display() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent comp : components) {
            comp.display();
        }
    }

    @Override
    public int getSize() {
        int total = 0;
        for (FileSystemComponent comp : components) {
            total += comp.getSize();
        }
        return total;
    }
}
