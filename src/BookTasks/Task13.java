package BookTasks;

public class Task13 {
    public static void main(String[] args) {
        ProgrammerBook book1 = new ProgrammerBook();
        book1.createValues("123", "456", "c#", 2,1);

        ProgrammerBook book2 = new ProgrammerBook();
        book2.createValues("123", "456", "c#", 2,2);

        printResult(book2.equals(book1));
        System.out.println(book2.hashCode());

        System.out.println(book2.toString());
    }

    private static void printResult(boolean bool){
        if(bool){
            System.out.println("Objects are equal");
        }else{
            System.out.println("Objects are not equal");
        }
    }
}
    class ProgrammerBook extends Book {
        private String language;
        private int level;


        public void createValues(String title,String author,String language, int level,int isbn){
            this.createValues(title,author,isbn);

            this.language=language;
            this.level = level;

        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }

            ProgrammerBook object = (ProgrammerBook)obj;

            if(object.title.equals(this.title) && object.author.equals(this.author) &&
                    object.price==this.price && object.edition==this.edition
                    && object.language.equals(this.language) && object.level==this.level)
                return true;

            return false;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 31 * result + ((title == null) ? 0 :title.hashCode());
            result = 31 * result + ((author == null) ? 0 :author.hashCode());
            result = 31 * result + price;
            result = 31 * result + Book.edition;
            result = 31 * result +  ((language == null) ? 0 :language.hashCode());
            result = 31 * result + level;
            return result;
        }

        @Override
        public String toString() {
            String result = "Title: " + title.toString() +"\n";
            result+= "Author: " + author.toString() +"\n";
            result+= "Price: " + price +"\n";
            result+= "Edition: " + Book.edition +"\n";
            result+= "Language: " + language +"\n";
            result+= "Level: " + level +"\n";
            return result;
        }
    }

