public class Tea extends Beverage {
    public Tea() {
        this.name = "Tea";
    }

    @Override
    public void serve() {
        System.out.println("Serving a warm cup of Tea");
    }
}
