package lessons.FactorialRecursive;

public class RecursiveEpam2 {
    public static void main(String[] args) {
        f(1);
    }

    private static void f(int argument) {
//        System.out.print(" " + argument); // выведет в обычном порядке

        if (argument < 10) { //вызывать метод f() пока меньше десяти
            f(argument + 1); // пока меньше десяти +1
        }

        System.out.print(" " + argument); // выведет в обратном порядке
    }
}
