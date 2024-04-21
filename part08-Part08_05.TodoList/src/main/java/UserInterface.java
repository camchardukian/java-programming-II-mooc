import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;

    }

    public void start() {
        while (true) {
            System.out.println("Command");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.println("To add:");
                String taskToAdd = scanner.nextLine();
                todoList.add(taskToAdd);
            } else if (command.equals("list")) {
                todoList.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int taskToRemove = Integer.valueOf(scanner.nextLine());
                todoList.remove(taskToRemove);
            }
        }
    }
}
