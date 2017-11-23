package lessons.Polindrom;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {""};
        String a = ""; // содержит в себе массив
        String test = ""; // реверсированная переменная
        System.out.println("Enter word");

        // вводимые символы запихиваем в массив arr
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();

            // значениями заполняем строку - a
            a = str[i];
        }
        // Преобразуем строку str в массив символов (char)
        char[] strToArray = a.toCharArray();

        /** перебираем символы слова, которое уже чаровый массив */
        for (int j = 0; j < strToArray.length; j++) {

            // если в нем больше 5 букв то ошибка
            if (strToArray.length > 5) {
                System.out.println("Ошибка необходимо ввести слово из 5 букв!");
                return;
            }
        }

        // переменная которорая будет обратной
        test = new StringBuilder(a).reverse().toString().toLowerCase();

        // сравним переменные для выяснения полиндром или нет
        if ((a).equals(test)) {
            System.out.println(test + " полиндром от " + a);
        } else {
            System.out.println("Это слово не полиндром!");
        }
    }
}

//    public static boolean isPalindrome(String text) {
//        return text.replaceAll("\\W","")
//                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W",""))
//                        .reverse().toString());
//    }

//    public static Boolean isPalindrome(String s) {
//        return s.equals((new StringBuilder(s)).reverse().toString());
//    }