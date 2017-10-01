package lessons.FactorialRecursive;

public class MaxValueInTheArray {
    public static void main(String[] args) throws java.lang.Exception {
       //Рекурсивный поиск максимального элемента в массиве java
       // max = 0, это следующий сравниваемый элемент в массиве

        int[] a = {3, 5, 234, 5, 123, 2, 3, 5};

        System.out.println(findMax(a, 0));
    }

    private static int findMax(int[] n, int max) {
        if (n.length > max) {
            int next = findMax(n, max + 1);

            System.out.println("next=" + next + " max=" + max);

            return (n[max] > next) ? n[max] : next;
        } else {
            return n[0];
        }
    }
}


