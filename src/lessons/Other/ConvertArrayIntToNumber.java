package lessons.Other;

public class ConvertArrayIntToNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 0};
        long res = 0;
        for (int key : arr) {
            res = res * 10 + key;
        }
        System.out.print(res);
    }
}