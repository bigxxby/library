import java.util.ArrayList;

public class Student {
    private int ticketId;
    private String name;
    private ArrayList<Book> books;
    private int pen; // сколько долгов у студента


    public int getPen() {
        return pen;
    }

    public void setPen(int pen) {
        this.pen = pen;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Student(int ticketId, String name, ArrayList<Book> books) {
        this.ticketId = ticketId;
        this.name = name;
        this.books = books;
        this.books = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public void showStudent() {
        StringBuilder str = new StringBuilder();
        for (Book b : books) {
            str.append(b.getName()).append("\n");
        }
        System.out.println(ticketId + " " + name);
        System.out.println(str);
    }

    public void dayPast() { // абстрактный метод "одного дня", прошел один день
        for (Book books : getBooks()) {

            int v = books.getBorrowedTime();
            books.setBorrowedTime(--v);
        }
    }
}
