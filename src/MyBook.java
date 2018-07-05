/**
 * Created by Shweta on 7/8/2017.
 */
public class MyBook extends Book {
    int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    public void display() {
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %d\n", this.title, this.author, this.price);
    }

    public void hi() {
        super.hi();
        System.out.println("Hi");
    }
}
