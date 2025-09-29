
public class LightAdapter implements SmartDevice {
    private PhilipsHue light;

    public LightAdapter(PhilipsHue light) {
        this.light = light;
    }

    @Override
    public void turnOn() {
        light.enableLight();
    }

    @Override
    public void turnOff() {
        light.disableLight();
    }
}
