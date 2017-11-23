package lessons.Polindrom;

public class PolindromClock {
    public static void main(String[] args) {
/*
Электронные часы показывают время в формате от 00:00 до 23:59.
Подсчитать сколько раз за сутки случается так, что слева
от двоеточия показывается симметричная комбинация для той,
что справа от двоеточия (например, 02:20, 11:11 или 15:51).
*/
        int counter = 0;
        String format = "%02d";
        StringBuilder sb1 = new StringBuilder(), sb2 = new StringBuilder();
        for (int i = 0; i < 24; i++) {

            sb1.append(String.format(format, i));
            for (int j = 0; j < 60; j++) {

                sb2.append(String.format(format, j)).reverse();

                if (sb1.toString().equals(sb2.toString())) {

                    System.out.printf("%02d - %s:%s\n", ++counter, sb1, sb2.reverse());
                }

                sb2.delete(0, sb2.length());
            }

            sb1.delete(0, sb1.length());
        }
    }
}
