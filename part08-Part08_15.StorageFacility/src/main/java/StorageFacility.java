import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (storage.get(unit) == null) {
            storage.put(unit, new ArrayList<>());
        }
        storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (storage.get(storageUnit) == null) {
            return new ArrayList<>();
        }
        return storage.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        if (storage.containsKey(storageUnit)) {
            ArrayList<String> items = storage.get(storageUnit);
            items.remove(item);
            if (items.isEmpty()) {
                storage.remove(storageUnit);
            } else {
                storage.put(storageUnit, items);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitsWithItems = new ArrayList<>();
        for (String unit : storage.keySet()) {
            if (storage.get(unit) != null && !storage.get(unit).isEmpty()) {
                unitsWithItems.add(unit);
            }
        }
        return unitsWithItems;
    }
}
