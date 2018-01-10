package lessons.Polindrom;

public class PoliDigitalCompare {
    public static void main(String[] args) {
        int[] a = {34, 123, -343, 59, -121, 797, -454};

        for (int key : a) {
            System.out.print(key + ", ");
            int result = 0;
            while ((key > 0) || (key < 0)){
                result = result * 10 + key % 10;
                key = key / 10;

                for (int ke : a) {
                    if (ke == result) {
                        System.out.println("-> полиндром");
                    }
                }
            }
        }
    }
}
