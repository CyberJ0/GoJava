package lessons.Arrays.OneArrays;

public class NumFibanachi {
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


// вариант №2
//        int[] Mas = new int[20];
//        //С помощью простого цикла заполним значения елементов массива
//        for (int i = 0; i < Mas.length; i++) {
//            //Если индекс элемента массива меньше 2 присваиваем ему значение 1
//            if (i < 2) {
//                Mas[i] = 1;
//            }
//            //Во всех остальных случаях значение элемента массива равно сумме значений двух предыдущих елементов массива
//            else {
//                Mas[i] = Mas[i - 2] + Mas[i - 1];
//            }
//            System.out.print(Mas[i] + " ");
//        }
    }
}
