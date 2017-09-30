package lessons.Arrays.OneArrays;

public class lesson8 {
    public static void main(String[] args) {

//        Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
//        Определите какой элемент является в этом массиве максимальным и
//        сообщите индекс его последнего вхождения в массив.


        int[] arr = new int[12];
        int maxArr = arr[0];
        int indxMaxArr = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 31) - 15;
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxArr) {
                maxArr = arr[i];
                indxMaxArr = i;
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент: " + maxArr);
        System.out.println("Индекс: " + indxMaxArr);
    }
}
