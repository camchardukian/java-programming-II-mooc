package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean isOn;

    public TemperatureSensor() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn() {
        isOn = true;
    }

    public void setOff() {
        isOn = false;
    }

    public int read() {
        if (isOn) {
            return new Random().nextInt(61) - 30;
        }
        throw new IllegalStateException("sensor is off");
    }
}
