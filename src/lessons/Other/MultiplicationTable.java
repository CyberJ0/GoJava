package lessons.Other;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%5d", (i + 1) * (j + 1)); // форматированная строка вывода printf
                // %5d = В десятеричном. Минимальная ширина строки 5 знаков.
            }
            System.out.println();
        }
    }
}
