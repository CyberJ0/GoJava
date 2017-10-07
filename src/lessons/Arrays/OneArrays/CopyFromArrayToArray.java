package lessons.Arrays.OneArrays;

public class CopyFromArrayToArray {
    public static void main(String[] args) {

        // Операторы создают два массива, затем копируют последние 4 элемента первого массива во второй.
        // копирование начинается со второй позиции smailPrimes (в исходном массиве),
        // копируемые элементы помещаются в luckyNumbers (в целевой массив), начиная с третьей позиции

        int[] smallPrimes = {2, 3, 5, 7, 11, 13}; // 6 позиций
        int[] luckyNumbers = {1001, 1002, 1003, 1004, 1005, 1006, 1007}; // 7 позиций
        System.arraycopy(smallPrimes, 2, luckyNumbers, 3, 4);
        for (int i = 0; i < luckyNumbers.length; i++)
            System.out.println(i + ": " + luckyNumbers[i]);
    }
}
