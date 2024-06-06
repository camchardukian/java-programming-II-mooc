public class OneItemBox extends Box {
    private Item storedItem;

    public OneItemBox() {

    }

    @Override
    public void add(Item item) {
        if (storedItem == null) {
            storedItem = item;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return item.equals(storedItem);
    }
}
