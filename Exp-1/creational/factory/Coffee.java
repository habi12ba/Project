public class Coffee extends Beverage {
    public Coffee() {
        this.name = "Coffee";
    }

    @Override
    public void serve() {
        System.out.println("Serving a hot cup of Coffee");
    }
}
