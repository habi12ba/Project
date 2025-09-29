// Leaf
public class File implements FileSystemComponent {
    private String name;
    private int size; // in KB

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("File: " + name + " (" + size + " KB)");
    }

    @Override
    public int getSize() {
        return size;
    }
}
