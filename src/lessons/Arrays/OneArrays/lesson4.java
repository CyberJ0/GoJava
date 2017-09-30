package lessons.Arrays.OneArrays;

public class lesson4 {
    public static void main(String[] args) {

//        Создайте массив из 8 случайных целых чисел из отрезка [1;10].
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

    int arr[] = new int[8];
        for (int i = 0; i < arr.length; i++) {
        arr[i] = (int) (Math.random() * 10) + 1;
        System.out.print(arr[i] + "\t");
        if(arr[i] % 2 == 1){
            arr[i] = 0;
        }
    }
        System.out.println();
        for (int arrN : arr) {
        System.out.print(arrN + "\t");
    }
}
}
