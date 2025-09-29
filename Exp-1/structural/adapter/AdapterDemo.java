public class AdapterDemo {
    public static void main(String[] args) {
        SmartDevice light = new LightAdapter(new PhilipsHue());
        SmartDevice fan = new FanAdapter(new DysonFan());
        SmartDevice thermostat = new ThermostatAdapter(new NestThermostat());

        System.out.println("=== Turning ON devices ===");
        light.turnOn();
        fan.turnOn();
        thermostat.turnOn();

        System.out.println("=== Turning OFF devices ===");
        light.turnOff();
        fan.turnOff();
        thermostat.turnOff();
    }
}
