public class Main {
    public static void main(String[] args) {
        // Register factories
        BeverageFactory.registerFactory("Coffee", new CoffeeFactory());
        BeverageFactory.registerFactory("Tea", new TeaFactory());
        BeverageFactory.registerFactory("Juice", new JuiceFactory());

        // Serve all beverages automatically
        BeverageFactory.serveAllBeverages();

    }
}
