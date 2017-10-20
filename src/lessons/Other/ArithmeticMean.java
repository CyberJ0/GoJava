package lessons.Other;

public class ArithmeticMean {
    public static void main(String[] args) {
        int[] mice = {8, 4, 1, 5, 7};
        int result = 0;

        for (int i = 0; i < mice.length; i++) {
            result += mice[i];
            System.out.println(result);
        }
        System.out.println("Среднее арифметическое: " + (result /= 5));
        // 8 + 4 + 1 + 5 + 7 = 25;
        // 25 / 5 = 5;
    }
}