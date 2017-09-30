package lessons.Arrays.OneArrays;

public class lesson9 {
    public static void main(String[] args) {

//        Создайте массив из 8 случайных целых чисел из отрезка [-25;11].
//        Определите какой элемент является в этом массиве минимальным и
//        сообщите индекс его последнего вхождения в массив.

        int[] arr = new int[8];
        int indx = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 11 + (int) (Math.random() * (25 - 11));
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int min = arr[0]; //(!) ОЧЕНЬ важно что бы переменная была сдесь!
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
                indx = i;
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.print("Индекс: " + indx);

    }
}
