package BookTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Task15 {

    public static void main(String[] args) {
        BookTitleComparator playerComparator = new BookTitleComparator();

        ArrayList<Book> books = new ArrayList<Book>();

        var book1 = new Book();
        book1.createValues("abc", "678", 1);
        book1.price = 5;

        var book2 = new Book();
        book2.createValues("cde", "456", 2);
        book2.price = 4;

        var book3 = new Book();
        book3.createValues("bcd", "123", 3);
        book3.price = 3;

        books.add(book1);
        books.add(book2);
        books.add(book3);

        System.out.println("Title sorting:");

        Comparator<Book> bookComparator = new BookTitleComparator();
        Collections.sort(books, bookComparator);

        printResult(books);

        System.out.println("Author sorting:");

        bookComparator = new BookAuthorComparator();
        Collections.sort(books, bookComparator);

        printResult(books);

        System.out.println("Price sorting:");

        bookComparator = new BookAuthorComparator();
        Collections.sort(books, bookComparator);

        printResult(books);

        System.out.println("Author->Title sorting:");

        var book4 = new Book();
        book4.createValues("cde", "123", 4);
        book4.price = 3;

        books.add(book4);

        bookComparator = new BookAuthorTitleComparator();
        Collections.sort(books, bookComparator);

        printResult(books);

        System.out.println("Title->Author sorting:");

        bookComparator = new BookTitleAuthorComparator();
        Collections.sort(books, bookComparator);

        printResult(books);

    }
    private static void printResult(ArrayList<Book> books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
        System.out.println();
    }

}

class BookPriceComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.price, o1.price);
    }
}

class BookTitleAuthorComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {

        int result = StringComparator.compare(o1.title,o2.title);
        if (result==0)
            result = StringComparator.compare(o1.author,o2.author);

        return result;
    }
}