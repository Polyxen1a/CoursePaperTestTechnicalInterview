public class Main {
    public static void main(String[] args) {
        String[][] bookAuthors = {
                {"Книга 1", "Иван", "Иванов", "Петрович"},
                {"Книга 2", "Анна", "Смирнова", "Александровна"},
                {"Книга 3", "Петр", "Сидоров", "Михайлович"}
        };

        for (String[] bookAuthor : bookAuthors) {
            String bookTitle = bookAuthor[0];
            String authorFullName = bookAuthor[1] + bookAuthor[2] + bookAuthor[3];
            System.out.println(bookTitle + authorFullName);
        }
    }
}
