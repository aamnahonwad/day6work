import java.util.LinkedHashSet;

class BookTitles {
    public static void main(String[] args) {

        LinkedHashSet<String> books = new LinkedHashSet<>();

        books.add("Java Basics");
        books.add("Data Structures");
        books.add("Operating Systems");
        books.add("DBMS");
        books.add("Java Basics"); 

        System.out.println("Books in Insertion Order: " + books);
    }
}
