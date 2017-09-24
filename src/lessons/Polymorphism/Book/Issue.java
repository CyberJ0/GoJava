package lessons.Polymorphism.Book;

import java.io.PrintStream;

public class Issue {
    String name;

    public Issue(String name) {
        this.name = name;
    }

    public void print(PrintStream out) {
        out.print("Наименование: " + name + ";\n");
    }



    public static void main(String[] args) {
        Issue[] catalog = new Issue[]{
                new Journal("Play Boy"),
                new NewsPaper("СпидИнфо"),
                new Book("Война и мир", "Л.Толстой"),
        };

        for (int i = 0; i < catalog.length; i++) {
            catalog[i].print(System.out);
        }
    }
}
