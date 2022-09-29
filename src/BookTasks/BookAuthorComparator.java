package BookTasks;



import java.util.Comparator;

public class BookAuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return StringComparator.compare(o1.author, o2.author);
    }
}
