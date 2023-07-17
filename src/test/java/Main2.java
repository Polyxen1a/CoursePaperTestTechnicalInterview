import java.util.HashMap;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {

        String[][] bookAuthors = {
                {"Книга 1", "Иван", "Иванов", "Петрович"},
                {"Книга 2", "Анна", "Смирнова", "Александровна"},
                {"Книга 3", "Петр", "Сидоров", "Михайлович"}
        };

        Map<String, String> bookAuthorMap = new HashMap<>();

        for (String[] bookAuthor : bookAuthors) {
            String bookTitle = bookAuthor[0];
            String authorFullName = bookAuthor[1] + bookAuthor[2] + bookAuthor[3];
            bookAuthorMap.put(bookTitle, authorFullName);
        }

        for (Map.Entry<String, String> entry : bookAuthorMap.entrySet()) {
            String bookTitle = entry.getKey();
            String authorFullName = entry.getValue();
            String result = bookTitle + authorFullName;
            System.out.println(result);
        }
    }
}