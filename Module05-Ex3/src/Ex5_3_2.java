import java.util.ArrayList;
import java.util.Collections;

class Book implements Comparable<Book> {
    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int compareTo(Book b) {
        return this.price - b.price;
    }
}

public class Ex5_3_2 {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("○○○", "△△", 400));
        bookList.add(new Book("●●●", "✕✕", 100));
        bookList.add(new Book("◎◎◎", "□□", 200));

        Collections.sort(bookList);
        for (Book item : bookList) {
            System.out.println(item.title + " " + item.author + " " + item.price);
        }
    }
}
