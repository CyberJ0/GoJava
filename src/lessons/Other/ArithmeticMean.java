package lessons.Other;

public class ArithmeticMean {
    public static void main(String[] args) {
        int [] mice = {8,4,1,5,7};
        int result = 0;

        for (int i = 0; i < mice.length; i++) {
            result += mice[i];
            System.out.println(result);
        }
        result /= 5;
        System.out.println("Среднее арифметическое: " + result);
    }
}