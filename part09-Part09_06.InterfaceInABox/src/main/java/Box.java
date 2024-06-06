import java.util.ArrayList;

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= capacity) {
            items.add(item);
        }
    }

    public double weight() {
        double weight = 0;
        for (Packable item : items) {
            weight = weight + item.weight();
        }
        return weight;
    }

    public String toString() {
        return "Box: " + items.size() + " items" + ", total weight " + weight() + " kg";
    }

}
