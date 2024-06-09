
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.println("Input the age recommendation:");
            int ageRecommendation = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, ageRecommendation));
        }
        System.out.println(books.size() + " books in total.");
        System.out.println("Books:");
        books.sort(Comparator.comparingInt(Book::getAgeRecommendation).thenComparing(Book::getTitle));
        books.forEach(System.out::println);
    }

}
