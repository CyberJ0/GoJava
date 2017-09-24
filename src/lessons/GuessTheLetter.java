package lessons;

import java.util.Random;
import java.util.Scanner;

public class GuessTheLetter {
    public static void main(String[] args) {
//        Создайте простую игру основанную на угадывании букв.
//        Пользователь должен угадать загаданную букву A-Z введя
//        ее в консоль. Если пользователь угадал букву программа выведет «Right»
//        и игра закончится, если нет, то пользователь продолжит вводить буквы.
//        (Опционально) Вывести «Буква выше!»- если пользователь ввел букву
//        меньше загаданной, «Буква ниже!»- если пользователь ввел букву
//        больше загаданной.

        Scanner sc = new Scanner(System.in);

        char ch = (char) ('a' + new Random().nextInt(26));

        System.out.println(ch);
        System.out.println("Привет, постарайся угадать букву!");

        for (char i = 0; i < 26; i++) {
            char s = sc.next().charAt(0);

            if (ch == s) {
                System.out.println("Поздравляю! В этот раз угадал.");
                break;
            } else {
                System.out.println("Не угадал! Попробуй еще раз!");

                if (Character.getNumericValue(ch) > Character.getNumericValue(s)) {
                    System.out.println("Дам подсказку! Буква ниже");
                } else if (Character.getNumericValue(ch) < Character.getNumericValue(s)) {
                    System.out.println("Дам подсказку! Буква выше!");
                }
            }
        }
    }
}
