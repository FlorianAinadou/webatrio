public class Book {
    public final String title;
    public final String author;
    public BookType type;

    public Book(String title, String author, BookType type) {
        this.author = author;
        this.title = title;
        this.type = type;
    }

}
