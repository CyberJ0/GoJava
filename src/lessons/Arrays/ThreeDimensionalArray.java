package lessons.Arrays;

// трехмерный массив
public class ThreeDimensionalArray {
    public static void main(String[] args) {
        int[][][] arr = new int[2][2][3];
        arr[0][0][0] = 1;
        arr[0][0][1] = 2;
        arr[0][1][2] = 3;

        arr[0][1][0] = 4;
        arr[0][1][1] = 5;
        arr[0][1][2] = 6;

        arr[1][0][0] = 7;
        arr[1][0][1] = 8;
        arr[1][0][2] = 9;

        arr[1][1][0] = 10;
        arr[1][1][1] = 11;
        arr[1][1][2] = 12;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int f = 0; f < 3; f++) {
                    inf(i,j,f);
                    System.out.println(arr[i][j][f]);
                }
            }
        }
    }
    static void inf(int i, int j, int f){
        System.out.print("Столбец(i) = " + i + " : Строка(j) = " + j + " : Подстрока(f) = " + f + " Значение = ");
    }

}
