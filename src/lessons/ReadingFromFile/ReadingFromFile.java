package lessons.ReadingFromFile;

import java.io.*; // подключение всех io библиотек
import java.util.*; // подключение всех util библиотек

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException { // к мейн добавлен авто обработчик ошибок (вместо try catch в коде)
        Scanner scan = new Scanner(new FileInputStream("src\\test\\ReadingFromFile\\test.txt")); // путь к файлу

        // цикл выводящий все строки из файла
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        scan.close(); // для предотвращения утечки памяти останавливаем.
    }
}
