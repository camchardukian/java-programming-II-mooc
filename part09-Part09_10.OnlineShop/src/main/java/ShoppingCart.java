import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (items.containsKey(product)) {
            items.get(product).increaseQuantity();
        } else {
            Item item = new Item(product, 1, price);
            items.put(product, item);
        }
    }

    public int price() {
        return items.values().stream().mapToInt(Item::price).sum();
    }

    public void print() {
        items.values().forEach(System.out::println);
    }

}
