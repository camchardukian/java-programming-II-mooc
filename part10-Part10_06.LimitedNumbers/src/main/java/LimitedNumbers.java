
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (Integer.valueOf(input) < 0) {
                break;
            }
            inputs.add(input);
        }
        inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .forEach(value -> {
                    if (value >= 1 && value <= 5) {
                        System.out.println(value);
                    }
                });
    }
}
// After this, print all the numbers the
// user has given as input that are between 1 and 5.