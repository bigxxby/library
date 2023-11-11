import java.util.Date;

public class Book {
    private int id;
    private String name;
    private String author;
    private int borrowedTime ;

    public int getBorrowedTime() {
        return borrowedTime;
    }

    public void setBorrowedTime(int borrowedTime) {
        this.borrowedTime = borrowedTime;
    }

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void showBook() {
        System.out.println(id +" " + name +" " + author);
    }
}
