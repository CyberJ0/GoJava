package lessons.Arrays.OneArrays;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayGenerator {
    public static void main(String[] args) {
        int [] arr = new int[10]; // массив 10 на 10
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100); // граница рандомизации чисел 0-99
        }
        System.out.println(Arrays.toString(arr)); // вывод массива осуществляется коммандой Arrays.toString
    }
}
