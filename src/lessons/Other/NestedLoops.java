package lessons.Other;

public class NestedLoops {
    public static void main(String[] args) {
        // треугольники из *

        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }

        // разделитель
        System.out.println("");

        /** в обратную сторону */
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}