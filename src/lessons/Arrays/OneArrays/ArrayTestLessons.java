package lessons.Arrays.OneArrays;

import java.util.Arrays;

public class ArrayTestLessons {
    public static void main(String[] args) {
          int sum = 0;
          int[] arr = {1,2,3,4,5,6};
//        int[] arr = new int[6];
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//        arr[3]=4;
//        arr[4]=5;
//        arr[5]=6;
        System.out.println("Эл.массива в обратном порядке:");
        for (int i = arr.length-1; i >= 0; i--) {
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] % 2 == 0){
                System.out.println(arr[i] + " - четное");
            }
            else if(arr[i] % 2 == 1) {
                System.out.println(arr[i] + " - не четное");
            }else{
                System.out.println("Премия дауна!");
            }
        }
        System.out.println("\nВывод эл.массива " + Arrays.toString(arr));
        System.out.println("Сумма эл.массива = " + sum);
    }
}
