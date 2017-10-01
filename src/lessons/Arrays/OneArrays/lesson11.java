package lessons.Arrays.OneArrays;

import java.util.Random;

public class lesson11 {
    public static void main(String[] args) {

//        Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
//        Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
//        Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.

        int[] arr = new int[11];

        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(3) - 1;
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int key : arr) {
            // инкрементируются при выполнении условия
            if (key == 0) sum++;
            if (key == 1) sum2++;
            if (key == -1) sum3++;
        }
        if (sum > sum2 & sum > sum3) {
            System.out.println("Нулей больше: " + sum + " шт.");
        }
        if (sum2 > sum & sum2 > sum3) {
            System.out.println("Единиц больш: " + sum2 + " шт.");
        }
        if (sum3 > sum & sum3 > sum2) {
            System.out.println("Отрицательных единиц боьше: " + sum3 + " шт.");
        }
    }
}
