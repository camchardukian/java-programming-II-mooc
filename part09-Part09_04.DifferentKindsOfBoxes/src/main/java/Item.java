
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object otherObj) {
        if (this == otherObj) {
            return true;
        } else if (otherObj instanceof Item == false) {
            return false;
        }
        Item otherItem = (Item) otherObj;
        return name != null ? name.equals(otherItem.name) : otherItem.name == null;
    }

    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

}
