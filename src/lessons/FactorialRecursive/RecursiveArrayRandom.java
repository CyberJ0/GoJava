package lessons.FactorialRecursive;

import java.util.Random;

public class RecursiveArrayRandom {
    public static void main(String[] args) {
        int[][] array = new int[5][4];

        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++)
                    System.out.print(array[i][j] + "\t");
                System.out.println();
                }
        }

        public static void f(int arg){
            System.out.println();
//            f();
        }
    }
