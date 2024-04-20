
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int container1 = 0;
        int container2 = 0;
        System.out.println("First: " + container1 + "/100");
        System.out.println("Second: " + container2 + "/100");
        while (true) {
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount;
            try {
                amount = Integer.valueOf(parts[1]);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                amount = 0;
            }
            if (command.equals("quit")) {
                break;
            } else if (command.equals("add")) {
                if (amount > 0) {
                    container1 = container1 + amount;
                    if (container1 > 100) {
                        container1 = 100;
                    }
                }
            } else if (command.equals("move")) {
                if (container1 < amount) {
                    container2 = container2 + container1;
                    container1 = 0;
                } else {
                    container1 = container1 - amount;
                    container2 = container2 + amount;
                }
                if (container2 > 100) {
                    container2 = 100;
                }
            } else if (command.equals("remove")) {
                if (amount > container2) {
                    container2 = 0;
                } else {
                    container2 = container2 - amount;
                }
            }
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
        }
    }

}
