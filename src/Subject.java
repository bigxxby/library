public class Subject {
    private String name;
    private Book bookForSubject; // книга которая необходима для предмета

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBookForSubject() {
        return bookForSubject;
    }

    public void setBookForSubject(Book bookForSubject) {
        this.bookForSubject = bookForSubject;
    }

    public Subject(String name, Book bookForSubject) {
        this.name = name;
        this.bookForSubject = bookForSubject;
    }
}
