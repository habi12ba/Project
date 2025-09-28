public class JuiceFactory extends BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new Juice();
    }
}
