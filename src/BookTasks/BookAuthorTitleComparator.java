package BookTasks;

import java.util.Comparator;

class BookAuthorTitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {

        int result = StringComparator.compare(o1.author, o2.author);
        if (result == 0)
            result = StringComparator.compare(o1.title, o2.title);

        return result;
    }
}
