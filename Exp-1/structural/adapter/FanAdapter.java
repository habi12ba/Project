
public class FanAdapter implements SmartDevice {
    private DysonFan fan;

    public FanAdapter(DysonFan fan) {
        this.fan = fan;
    }

    @Override
    public void turnOn() {
        fan.startFan();
    }

    @Override
    public void turnOff() {
        fan.stopFan();
    }
}
