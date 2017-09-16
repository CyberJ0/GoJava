package lessons.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class EnterNumArrayExitArrayValue {
    public static void main(String[] args) {
        int[] a;
        int b;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num of array: ");
        b = scan.nextInt();
        a = new int[b];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a[" + i + "] = ");
            a[i] = scan.nextInt();
        }
        System.out.println("Введен массив: " + Arrays.toString(a));
    }
}
