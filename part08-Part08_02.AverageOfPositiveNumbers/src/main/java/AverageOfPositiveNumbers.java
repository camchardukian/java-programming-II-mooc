
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int positiveNumberCount = 0;
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                if (positiveNumberCount == 0) {
                    System.out.println("Cannot calculate the average");
                } else {
                    System.out.println((double) sum / positiveNumberCount);
                }
                break;
            }
            if (value > 0) {
                positiveNumberCount++;
                sum += value;
            }
        }
    }
}
