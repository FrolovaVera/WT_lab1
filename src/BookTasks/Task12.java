package BookTasks;

import BookTasks.Book;

public class Task12 {

    public static void main(String[] args) {
        var book1 = new Book();
        book1.createValues("123","456",1);
        System.out.println("Book1\n"+book1.toString());
        System.out.println(book1.hashCode());

        var book2 = new Book();
        book2.createValues("123","456",2);
        System.out.println("Book2\n"+book1.toString());
        System.out.println(book2.hashCode());
        printResult(book1.equals(book2));

        book2.createValues("1234","456",3);
        System.out.println("Book2\n"+book1.toString());
        printResult(book1.equals(book2));

        printResult(book1.equals(8));


    }

    private static void printResult(boolean bool){
        if(bool){
            System.out.println("Objects are equal");
        }else{
            System.out.println("Objects are not equal");
        }
    }
}

