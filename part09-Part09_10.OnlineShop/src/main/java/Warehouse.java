import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stockMap;

    public Warehouse() {
        products = new HashMap<String, Integer>();
        stockMap = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
        if (stockMap.get(product) != null) {
            stockMap.put(product, stockMap.get(product) + stock);
        } else {
            stockMap.put(product, stock);
        }
    }

    public int price(String product) {
        if (products.get(product) != null) {
            return products.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (stockMap.get(product) != null) {
            return stockMap.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (stockMap.get(product) == null || stockMap.get(product) == 0) {
            return false;
        } else if (stockMap.get(product) == 1) {
            stockMap.put(product, stockMap.get(product) - 1);
            return false;
        }
        stockMap.put(product, stockMap.get(product) - 1);
        return true;
    }

    public Set<String> products() {
        return products.keySet();
    }

}
