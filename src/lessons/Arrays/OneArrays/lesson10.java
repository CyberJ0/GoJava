package lessons.Arrays.OneArrays;

import java.util.Arrays;
import java.util.Random;

public class lesson10 {
    public static void main(String[] args) {

//      Создайте два массива из 10 целых случайных чисел из отрезка [1;9]
//      и третий массив из 10 действительных чисел. Каждый элемент с i-ым индексом
//      третьего массива должен равняться отношению элемента из первого массива
//      с i-ым индексом к элементу из второго массива с i-ым индексом. Вывести все
//      три массива на экран (каждый на отдельной строке), затем вывести количество
//      целых элементов в третьем массиве.

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        double[] arr3 = new double[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arr1[i] = rand.nextInt(9) + 1;
            arr2[i] = rand.nextInt(9) + 1;
            arr3[i] = (double) arr1[i] / arr2[i];
        }
// сделать третий массив целочисленным
        int val = 0;
        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i] % 1 == 0){
                val ++; // количество целочисленных +1 с каждым найденным
            }
        }
        System.out.print(Arrays.toString(arr1) + "\n");
        System.out.print(Arrays.toString(arr2) + "\n");
        System.out.print(Arrays.toString(arr3) + "\n");
        System.out.print("Количество целых элементов: " + val);
    }
}
