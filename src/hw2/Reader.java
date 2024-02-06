package hw2;

import java.time.LocalDate;

public class Reader {
    private final String fullName;
    private final int readersTicketNum;
    private final String faculty;
    private final LocalDate birthDate;
    private final String phoneNumber;

    public Reader(String fullName, int readersTicketNum, String faculty, LocalDate birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.readersTicketNum = readersTicketNum;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }


    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги");
    }

    public void takeBook(String... bookNames) {
        System.out.println(fullName + " взял книги: " + String.join(", ", bookNames));
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (Book book : books) {
            System.out.print(book.getTitle() + ", ");
        }
        System.out.println();
    }

    public void returnBook(String... bookNames) {
        System.out.print(fullName + " вернул книги: " + String.join(", ", bookNames));
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " отдал " + numberOfBooks + " книги");
    }
}
