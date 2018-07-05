/**
 * Created by Shweta on 7/8/2017.
 */
abstract class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void display();

    public void hi() {
        System.out.println("Hello world!");
    }
}
