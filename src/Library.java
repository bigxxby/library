import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<String> history;

    public Library() {
        setBooksFunc();
    }
    public Book getBookById (  int id ) {
        for (Book b: books) {
            if (b.getId() == id ) {
                return b;
            }
        }
        System.out.println("Нет такой книги под таким ID");
        return null;
    }
    public Book getBookByName (  String  name ) {
        for (Book b: books) {
            if (Objects.equals(b.getName(), name)) {
                return b;
            }
        }
        System.out.println("Нет такой книги под таким Именем");
        return null;
    }


    public void giveBook(Student student, Book book) {
        if (student.getPen() != 0) {
            System.out.println("У студента есть штраф! Невозможно выдать книгу");
            return;
        }
        book.setBorrowedTime(15);
        ArrayList<Book> booksOfStudent = student.getBooks(); // лист с книгами студента
        booksOfStudent.add(book); // добавляем книгу
        student.setBooks(booksOfStudent); //сет книгу
        String str = (book.getName() + " была выдана студенту " + student.getName());
        history.add(str); // добавили в историю
        System.out.println(str);
    }
    public void getBackBook(Student student, Book book) {
        ArrayList<Book> booksOfSt = student.getBooks();
        boolean exists = false ;
        for (Book b:booksOfSt) { // check if book exists
            if (b.getBorrowedTime() < 0) { // check if have a pen in one of the books
                int pens  = student.getPen();
                student.setPen(--pens);
                System.out.println("Студенту +1 Штраф!");
            }
            if (b.getName().equals(book.getName())) {
                exists = true;
            }

        }
        if (exists) {
            book.setBorrowedTime(0);
            booksOfSt.remove(book);
            student.setBooks(booksOfSt);
            String str = (book.getName() + " была взята от студента " + student.getName());
            System.out.println(str);
        }else {
            System.out.println("Нет такой книги у студента!");
        }


    }
    public void showbooks() {
        for ( Book book : this.books) {
            System.out.println(book.getName() );
        }
    }
    public void setBooksFunc() { // sets many books
        List<Book> list  = new ArrayList<>();
        Book book1 = new Book(1 , "Some book1" , "Adilhan");
        Book book2 = new Book(2 , "Some book2" , "Adilhan");
        Book book3 = new Book(3 , "Some book3" , "Adilhan");
        Book book4 = new Book(4 , "Some book4" , "Adilhan");
        Book book5 = new Book(5 , "Some book5" , "Adilhan");
        Book book6 = new Book(6 , "Some book6" , "Adilhan");

        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);
        books = (ArrayList<Book>) list;
        this.history = new ArrayList<String>();
    }
}
