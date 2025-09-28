public class TeaFactory extends BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new Tea();
    }
}
