package lessons.Scanner.Presidents;

import java.util.Scanner;

public class WhichPresidentWon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Какой президент победил на выборах 2017 года в США?");
        System.out.println("1 - Хиллари Клинтон \n2 - Дональд Трамп");
        int a = readInt(scan); // ниже метод с проверкой на вводимые значения
        if (a == 1) {
            System.out.println("Нет, вы не угадали!");
        } else {
            System.out.println("Правильно! 20 января 2017 года Дональд Трамп стал новым президентом США");
        }
    }

    private static int readInt(Scanner scan) {
        while (true) { // проверять до тех пор пока не будет правда (цифра 1 или 2)
            if (scan.hasNextInt()) {
                int choice = scan.nextInt(); // создаем переменную которая будет принимать вводимые значения с клавы
                if (choice == 1 || choice == 2) {
                    return choice;
                }
            } else {
                scan.next();  // продолжаем выбирать значение
            }
            System.out.println("Необходимо ввести цифру 1 или 2");
        }
    }
}