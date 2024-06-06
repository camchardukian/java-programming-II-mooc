import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        items = new ArrayList<>();
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() <= capacity) {
            capacity = capacity - item.getWeight();
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
