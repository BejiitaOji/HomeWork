package hw2;

public class Reader {
    String fullName;
    int readersTicketNum;
    String faculty;
    String birthDate;
    String phoneNumber;

    public Reader (String fullName, int readersTicketNum, String faculty, String birthDate, String phoneNumber) {
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
        System.out.print(fullName + " взял книги: ");
        for(String bookName : bookNames) {
            System.out.print(bookName + ", ");
        }
        System.out.println();
    }
    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getTitle());
            if(i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }
    public void returnBook(String... bookNames) {
        System.out.print(fullName + " вернул книги: ");
        for(String bookName : bookNames) {
            System.out.print(bookName + ", ");
        }
        System.out.println();
    }
    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " отдал " + numberOfBooks + " книги");
    }
}
