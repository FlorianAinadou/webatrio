import java.util.ArrayList;
import java.util.List;

public class Library {
    private final ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public List<Book> getBookByType(BookType type){
        ArrayList<Book> booksToReturn = new ArrayList<>();
        for (Book book : booksToReturn) {
            if (type.equals(book.type)){
                booksToReturn.add(book);
            }
        }
        return booksToReturn;
    }
}
