package lessons.Other;

public class SumCycleForeach {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        int sum = 0;
        for (int key : num) {
            sum += key;
            // System.out.println("Цикл: " + sum);
        }
        System.out.println("Сумма чисел: " + sum);
    }
}
