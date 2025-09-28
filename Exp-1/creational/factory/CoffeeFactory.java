public class CoffeeFactory extends BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new Coffee();
    }
}
