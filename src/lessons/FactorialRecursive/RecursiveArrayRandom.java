package lessons.FactorialRecursive;

import java.util.Random;

public class RecursiveArrayRandom {

    int f(int arg) {
        int result;
        if (arg == 1) return 1;

        return result = f(arg - 1) * arg;
    }

    public static void main(String[] args) {

// Создать массив и функцию которая посчитает все его элементы рекурсивно

        int[] array = new int[5];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        RecursiveArrayRandom recArrRand = new RecursiveArrayRandom();

//        System.out.println(recArrRand.f(array[i]));

    }
}