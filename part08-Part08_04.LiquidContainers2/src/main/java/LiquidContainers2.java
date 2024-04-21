
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container1 = new Container();
        Container container2 = new Container();
        System.out.println("First: " + container1.toString());
        System.out.println("Second: " + container2.toString());
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
                container1.add(amount);
            } else if (command.equals("move")) {
                if (container1.contains() < amount) {
                    container2.add(container1.contains());
                    container1.remove(amount);
                } else {
                    container1.remove(amount);
                    container2.add(amount);
                }
            } else if (command.equals("remove")) {
                container2.remove(amount);
            }
            System.out.println("First: " + container1.toString());
            System.out.println("Second: " + container2.toString());
        }
    }
}
