package hashmap;

import java.util.HashMap;
import java.util.Map;

public class BookService {
    //book's name as a key, String-type object
    Book senseAndSensibility = new Book("senseAndSensibility", 1811, "...");
    Book prideAndPrejudice = new Book("prideAndPrejudice ", 1811, "...");

    public void add() {
        HashMap<String, Book> directories = new HashMap<>();
        //books can be retrieved from the directory by book name
        directories.put(senseAndSensibility.getName(), senseAndSensibility);
        directories.put(prideAndPrejudice.getName(), senseAndSensibility);
        directories.forEach((s, book) -> System.out.println(directories));
    }

    public static void main(String[] args) {
        BookService bookService = new BookService();
        bookService.add();
    }
}