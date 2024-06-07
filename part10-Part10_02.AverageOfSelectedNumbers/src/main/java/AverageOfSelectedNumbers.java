
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

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
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        Double average = 0.0;
        if (input.equals("p")) {
            average = valueList.stream().mapToDouble(s -> Double.valueOf(s)).filter(value -> value > 0).average()
                    .orElse(Double.NaN);
        }
        if (input.equals("n")) {
            average = valueList.stream().mapToDouble(s -> Double.valueOf(s)).filter(value -> value < 0).average()
                    .orElse(Double.NaN);
        } else {
            System.out.println("invalid input");
        }
        System.out.println("average of the numbers: " + average);
    }
}
