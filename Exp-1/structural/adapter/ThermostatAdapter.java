
public class ThermostatAdapter implements SmartDevice {
    private NestThermostat thermostat;

    public ThermostatAdapter(NestThermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void turnOn() {
        thermostat.heatOn();
    }

    @Override
    public void turnOff() {
        thermostat.heatOff();
    }
}
