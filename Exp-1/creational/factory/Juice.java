public class Juice extends Beverage {
    public Juice() {
        this.name = "Juice";
    }

    @Override
    public void serve() {
        System.out.println("Serving a fresh glass of Juice");
    }
}
