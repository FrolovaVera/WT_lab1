package BookTasks;

public class Task14 {
    public static void main(String[] args) {

        var book1 = new Book();
        book1.createValues("123","456",1);

        Book book2 = (Book)book1.clone();

        System.out.println("Book1:\n"+book1.toString());
        System.out.println("Book2:\n"+book2.toString());
    }

}
