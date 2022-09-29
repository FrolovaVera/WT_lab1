package BookTasks;

public class Book implements Comparable<Book> {
    protected String title;
    protected String author;
    protected int price;
    protected static int edition;

    public int isbn;

    public void createValues(String title,String author,int isbn){
        this.title = title;
        this.author=author;
        this.isbn = isbn;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Book object = (Book)obj;

        if(object.title.equals(this.title) && object.author.equals(this.author) &&
                object.price==this.price && object.edition==this.edition)
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + ((title == null) ? 0 :title.hashCode());
        result = 31 * result + ((author == null) ? 0 :author.hashCode());
        result = 31 * result + price;
        result = 31 * result + edition;
        return result;
    }

    @Override
    public String toString() {
        String result = "Title: " + title.toString() +"\n";
        result+= "Author: " + author.toString() +"\n";
        result+= "Price: " + price +"\n";
        result+= "Edition: " + edition +"\n";
        return result;
    }
    @Override
    public Object clone()
    {
        Book book = new Book();
        book.title = this.title;
        book.author = this.author;
        book.price = this.price;
        book.edition = this.edition;
        return book;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(isbn, o.isbn);
    }


}
