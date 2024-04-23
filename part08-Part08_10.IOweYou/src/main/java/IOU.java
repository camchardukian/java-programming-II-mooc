import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> iou;

    public IOU() {
        iou = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        iou.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        if (iou.get(toWhom) != null) {
            return iou.get(toWhom);
        }
        return 0;
    }
}
