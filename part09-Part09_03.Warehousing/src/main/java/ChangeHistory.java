import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (history.size() == 0) {
            return 0;
        }
        return Collections.max(history);
    }

    public double minValue() {
        if (history.size() == 0) {
            return 0;
        }
        return Collections.min(history);
    }

    public double average() {
        return history.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

}
