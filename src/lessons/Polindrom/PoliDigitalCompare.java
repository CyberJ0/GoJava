package lessons.Polindrom;

public class PoliDigitalCompare {
    public static void main(String[] args) {
        int[] a = {17, -616, 123, 787, 49, 71, 321, -555};
        int ikey = 0;
        for (int key : a) {
            ikey = key;
            System.out.print(key + ", ");
            int result = 0;
            while (key != 0) {
                result = result * 10 + key % 10;
                key = key / 10;

                if (ikey == result) {
                    System.out.println("-> полиндром");
                }
            }
        }
    }
}
