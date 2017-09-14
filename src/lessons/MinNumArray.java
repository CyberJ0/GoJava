package lessons;

public class MinNumArray {
    public static void main(String[] args) {
        int []arr = new int[]{12,32,-61,55,87,12,-6,20,63,-75};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println("Минимальное число: " + min);
    }
}
