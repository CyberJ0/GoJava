package lessons.Arrays.OneArrays;

public class lesson7Fibanachi {
    public static void main(String[] args) {

//        Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
//        Напоминаем, что первый и второй члены последовательности равны единицам,
//        а каждый следующий — сумме двух предыдущих.

        int a = 1;
        int b = 1;
        System.out.print("0 " + a + " " + b + " ");

        int[] arr = new int[20];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = a + b;
            System.out.print(arr[i] + " ");
            a = b;
//            System.out.println("\na = b: " + a); // смотрел как это.... работает.
            b = arr[i];
//            System.out.println("b = arr[i]: " + b);
        }
    }
}
