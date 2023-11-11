import java.util.ArrayList;

public class Teacher {
    private String name ;
    private ArrayList<Subject> subjects ; // предметы которые ведет учитель
    private ArrayList<Book> books ; // Книги которые есть учителя

    public Teacher(String name, ArrayList<Subject> subjects, ArrayList<Book> books) {
        this.name = name;
        this.subjects = subjects;
        this.books = books;
    }
    public  void teachStudent(Student student , Subject subject) {
        if (!books.contains(subject.getBookForSubject())) {
            System.out.println("У препода нет нужной книги! Возьмите ее в библеотеке");
            return;
        }
        System.out.println("Студент учится...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
