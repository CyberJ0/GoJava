package lessons.Arrays.OneArrays;

import java.util.Scanner;

public class UsersInterviewsCarArray {
    public static void main(String[] args) {
        int [] massBMW = new int [3];
        int [] massAudi = new int [3];
        int answer;

        System.out.println("#1: Выберите BMW или Audi\nЕсли BMW нажмите - 1\nЕсли Audi нажмите - 2");
        Scanner scr = new Scanner(System.in);
        answer = scr.nextInt();
        if(answer == 1){
            massBMW[0] = 1;
        }else if(answer == 2){
            massAudi[0] = 1;
        }else{
            System.out.println("Некорректно введены данные!");
        }

        System.out.println("#2: Выберите BMW или Audi\nЕсли BMW нажмите - 1\nЕсли Audi нажмите - 2");
        Scanner scr2 = new Scanner(System.in);
        answer = scr2.nextInt();
        if(answer == 1){
            massBMW[1] = 1;
        }else if(answer == 2){
            massAudi[1] = 1;
        }else{
            System.out.println("Некорректно введены данные!");
        }

        System.out.println("#3: Выберите BMW или Audi\nЕсли BMW нажмите - 1\nЕсли Audi нажмите - 2");
        Scanner scr3 = new Scanner(System.in);
        answer = scr3.nextInt();
        if(answer == 1){
            massBMW[2] = 1;
        }else if(answer == 2){
            massAudi[2] = 1;
        }else{
            System.out.println("Некорректно введены данные!");
        }
        /** Пробуем решить через for */
//        int countBMW = 0;
//        for (int i = 0; i < massBMW.length; i++) {
//            countBMW += massBMW[i];
//        }


//        int countAudi = 0;
//        for (int i = 0; i < massAudi.length; i++) {
//            countAudi += massAudi[i];
//        }

        /** Пробуем решить через foreach */
        int countBMW = 0;
        for (int keyBMW : massBMW) {
            countBMW += keyBMW;
        }


        int countAudi = 0;
        for (int keyAudi : massAudi) {
            countAudi += keyAudi;
        }
        System.out.println("Итог голосования:\n" + countBMW + " за BMW\n" + countAudi + " за Audi");
    }
}
