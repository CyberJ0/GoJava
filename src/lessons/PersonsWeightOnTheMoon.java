package lessons;

import java.util.Scanner;

public class PersonsWeightOnTheMoon {
    public static void main(String[] args) {
        // Задача:
        // сила тяжести на луне примерно равна 17%
        // ввести вес человека с клавиатуры и вычислить его вес на луне

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите вес человека: ");
        double weightOnTheEarth = scan.nextDouble();
        System.out.println("Вы ввели вес в " + weightOnTheEarth + " кг.");
        double weightOnTheMoon = weightOnTheEarth * 0.17;
        System.out.println("Вес человека на луне равен: " + weightOnTheMoon + "кг.");
    }
}
