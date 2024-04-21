import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todos;

    public TodoList() {
        todos = new ArrayList<>();

    }

    public void add(String task) {
        todos.add(task);
    }

    public void print() {
        for (int i = 1; i < todos.size() + 1; i++) {
            System.out.println(i + ": " + todos.get(i - 1));
        }
    }

    public void remove(int number) {
        todos.remove(number - 1);
    }
}
