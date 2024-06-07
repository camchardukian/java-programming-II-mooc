import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> herd;

    public Herd() {
        herd = new ArrayList<>();
    }

    public void move(int dx, int dy) {
        for (Movable thing : herd) {
            thing.move(dx, dy);
        }
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    public String toString() {
        StringBuilder infoBuilder = new StringBuilder();
        for (Movable thing : herd) {
            infoBuilder.append(thing.toString()).append("\n");
        }
        return infoBuilder.toString();
    }
}
