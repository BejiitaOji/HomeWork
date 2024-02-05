package hw2;

public class Library {
    public static void main(String[] args) {

        Reader reader = new Reader("Петров В. В.", 013666, "Ravenclaw", "01.01.2000", "88005553535");

        Book book1 = new Book("Приключения", "Пушкин");
        Book book2 = new Book("Энциклопедия", "Всезнамус");
        Book book3 = new Book("Словарь", "Ожегов");

        reader.takeBook(3);
        reader.takeBook("Приключения", "Энциклопедия", "Словарь");
        reader.takeBook(book1, book2, book3);

        reader.returnBook(3);
        reader.returnBook("Приключения", "Энциклопедия", "Словарь");


    }
}
