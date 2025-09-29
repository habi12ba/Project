public class FileSystemDemo {
    public static void main(String[] args) {
        // Leaf files
        File file1 = new File("main.java", 10);
        File file2 = new File("utils.java", 15);
        File file3 = new File("readme.md", 5);

        // Folders
        Folder src = new Folder("src");
        src.addComponent(file1);
        src.addComponent(file2);

        Folder docs = new Folder("docs");
        docs.addComponent(file3);

        Folder project = new Folder("MyProject");
        project.addComponent(src);
        project.addComponent(docs);

        // Client operations
        System.out.println("Displaying File System:");
        project.display();

        System.out.println("\nTotal size: " + project.getSize() + " KB");
    }
}
