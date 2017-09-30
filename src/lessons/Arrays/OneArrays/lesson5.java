package lessons.Arrays.OneArrays;

public class lesson5 {
    public static void main(String[] args) {

//        Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
//        выведите массивы на экран в двух отдельных строках.
//        Посчитайте среднее арифметическое элементов каждого массива и сообщите,
//        для какого из массивов это значение оказалось больше
//        (либо сообщите, что их средние арифметические равны).

        int sum = 0;
        int sum2 = 0;
        int sr1 = 0;
        int sr2 = 0;

        int arr[] = new int[5];
        int arr2[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 5);
            arr2[i] = (int) (Math.random() * 5);
            System.out.print(arr[i] + "\t");
            sum += arr[i];
            sr1 = sum / 5;
        }
        System.out.println("\nСумма: " + sum);
        System.out.println("Ср.арфм: " + sr1);

        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
            sum2 += arr2[i];
            sr2 = sum2 / 5;
        }
        System.out.println("\nСумма: " + sum2);
        System.out.println("Ср.арфм: " + sr2);

        System.out.println();
        if (sr1 > sr2) {
            System.out.println("Первый массив имеет большее среднее");
        } else if (sr1 < sr2) {
            System.out.println("Второй массив имеет большее среднее");
        } else {
            System.out.println("Cреднее массива 1 и 2, равны");
        }
    }
}
