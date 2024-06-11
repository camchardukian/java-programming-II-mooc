package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();

    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public boolean isOn() {
        return sensors.stream().allMatch(Sensor::isOn);
    }

    public void setOn() {
        sensors.forEach(Sensor::setOn);
    }

    public void setOff() {
        sensors.forEach(Sensor::setOff);
    }

    public int read() {
        if (sensors.size() == 0) {
            throw new IllegalStateException("no sensors added");
        } else if (sensors.stream().anyMatch(sensor -> sensor.isOn() == false)) {
            throw new IllegalStateException("all sensors must be on");
        }
        double average = sensors.stream()
                .mapToInt(Sensor::read)
                .average()
                .orElseThrow(() -> new IllegalStateException("Cannot calculate average"));
        int avgReading = (int) average;
        readings.add(avgReading);
        return avgReading;
    }

    public List<Integer> readings() {
        return new ArrayList<>(readings);
    }
}
