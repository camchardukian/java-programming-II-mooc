
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> valueList = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            valueList.add(Double.valueOf(input));
        }
        Double average = valueList.stream().mapToDouble(s -> Double.valueOf(s)).average().orElse(Double.NaN);
        System.out.println("average of the numbers: " + average);

    }
}
