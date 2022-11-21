package mapbasic;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Books implements Comparable<Books> {
    int id;
    String name;
    String author;
    String publisher;
    int quantity;

    // parameterised constructor
    public Books(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    // override equals()
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other == null) {
            return false;
        } else if (this.getClass() != other.getClass())
            return false;
        Books obj = (Books) other;
        if (id != obj.id) {
            return false;
        } else {
            return true;
        }
    }

    // override hashCode()
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public int compareTo(Books o) {
        // TODO Auto-generated method stub
        return this.id - o.id;
    }

    // override toString()
    @Override
    public String toString() {
        return "Book [author=" + author + ", id=" + id + ", name=" + name + ", publisher=" + publisher + ", quantity="
                + quantity + "]";
    }

}

public class BookMarket {

    public static void main(String[] args) {

        Books b1 = new Books(121, "Let us C", "Yashwant Kanetkar", "BPB", 8); 
        Books b2 = new Books(233, "Operating System", "Galvin", "Wiley", 6);
        Books b3 = new Books(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Books b4 = new Books(121, "Let us C", "Yashwant Kanetkar", "Mc Graw Hill", 11);

        List<Books> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        // print all the books
        System.out.println("-----Book list is------");
        books.stream().forEach(System.out::println);

        // create a Set of books by using the collector method and print it
        System.out.println("-----Book set is------");
        Set<Books> bookSet = books.stream().collect(Collectors.toSet());
        bookSet.stream().forEach(System.out::println);

        System.out.println("-----Sorted & Doubled quantity Book & filter books with quantity>10 list is------");
        books.stream().sorted().map(o -> {
            o.quantity = o.quantity * 2;
            return o;
            
        }).filter(o -> o.quantity > 10).collect(Collectors.toList()).forEach(System.out::println);
        
        // use reduce() to print the quantity sold of books having id < 200
        int soldBooks = books.stream().filter(o -> o.id < 200).map(o -> o.quantity).reduce(0, (ans, q) -> ans + q);
        System.out.println("quantity sold of books having id < 200 is " + soldBooks);
    }
}
