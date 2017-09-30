package lessons.FactorialRecursive;

public class RecurseEpam {
    public static void main(String[] args) {
        f(1);
    }

    public static void f(int x) {
        System.out.print(" " + x); // выведет в обычном порядке
        if (x < 10) {
            f(2 * x);
        }
//      System.out.print(" " + x); // выведет в обратном порядке
    }
}

