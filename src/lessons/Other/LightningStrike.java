package lessons.Other;

import java.util.Scanner;

public class LightningStrike {
    public static void main(String[] args) {
// Задача:
// Рассчитать расстояния до места удара молнии. Звук в воздухе распространяется
// со скоростью приблизительно равной 1100 футам в секунду.
// Зная интервал времени между вспышкой молнии и звуком сопровождающим ее
// можно рассчитать расстояние. Допустим интервал 7,2 секунды.

        double a, b, c;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите секунды после вспышки: ");
        b = scn.nextDouble();
        System.out.print("Введите скорость распространения звука в футах: ");
        a = scn.nextDouble();
        c = b * a;
        System.out.println("Расстояние до удара молнии равняется: " + c + " футам");
        // перевод футов в метры
        double metr = c * 0.3048;
        System.out.println("В " + c + " фут., " + metr + " м.");
    }
}
