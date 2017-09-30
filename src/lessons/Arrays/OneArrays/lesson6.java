package lessons.Arrays.OneArrays;

public class lesson6 {
    public static void main(String[] args) {


//        Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
//        Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.


        int arr[] = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 + (int) (Math.random() * (99 - 10) + 1);
            System.out.print(arr[i] + "\t");
        }
        boolean equally = true;
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                equally = false;
            }
        }
        System.out.println("Массив по возрастанию: " + equally);

    }
}
