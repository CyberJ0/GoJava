package lessons.Polymorphism.Book;

import java.io.PrintStream;

public class Book extends Issue {
    String authors;

    public Book(String name, String authors) {
        super(name);
        this.authors = authors;
    }

    @Override
    public void print(PrintStream out) {
        out.println("\nАвторы: " + authors);
        super.print(out);
    }
}
