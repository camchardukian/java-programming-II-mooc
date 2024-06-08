
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).map(line -> {
                String[] parts = line.split(",");
                String name = parts[0];
                int year = Integer.valueOf(parts[1]);
                int pages = Integer.valueOf(parts[2]);
                String author = parts[3];
                return new Book(name, year, pages, author);
            }).forEach(book -> books.add(book));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
        return books;
    }

}
