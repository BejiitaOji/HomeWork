package hw2;

import java.time.LocalDate;

public class Library {
    public static final String ADVENTURE_BOOK = "Приключения";
    public static final String ENCYCLOPEDIA = "Энциклопедия";
    public static final String DICTIONARY = "Словарь";
    public static void main(String[] args) {

        Reader reader = new Reader("Петров В. В.", 013666, "Ravenclaw", LocalDate.of(2000, 01, 01), "88005553535");

        Book book1 = new Book(ADVENTURE_BOOK, "Пушкин");
        Book book2 = new Book(ENCYCLOPEDIA, "Всезнамус");
        Book book3 = new Book(DICTIONARY, "Ожегов");

        reader.takeBook(3);
        reader.takeBook(ADVENTURE_BOOK, ENCYCLOPEDIA, DICTIONARY);
        reader.takeBook(book1, book2, book3);

        reader.returnBook(3);
        reader.returnBook(ADVENTURE_BOOK, ENCYCLOPEDIA, DICTIONARY);


    }
}
