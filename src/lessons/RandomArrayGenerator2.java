package lessons;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayGenerator2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // 10 элементов, не больше 19 (от 0 до 19 = 20 элементов)
            int[] arr = generateRandomIntArray(10, 20);
            int min = minNumArr(arr);

            // вывод массива осуществляется коммандой Arrays.toString
            System.out.println(Arrays.toString(arr));
            System.out.println("Минимальное значение: " + min);
            System.out.println();
        }
    }
    private static int[] generateRandomIntArray(int arrLength, int upperBound) {
        int [] arr = new int[arrLength];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(upperBound); // верхняя граница
        }
        return arr;
    }

    private static int minNumArr(int[] arr){
    int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }
}

