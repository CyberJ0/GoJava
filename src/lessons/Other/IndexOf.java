package lessons.Other;

public class IndexOf {
    public static void main(String[] args) {

/*
**************************************************************
Метод indexOf() в Java имеет следующие варианты:
  public int indexOf(int ch) — возвращает индекс в данной строке первого
  вхождения указанного символа или -1, если символ не встречается.

  public int indexOf(int ch, int fromIndex) — возвращает индекс
  в данной строке первого вхождения указанного символа, начиная поиск
  по указанному индексу, или значение -1, если символ не встречается.

  int indexOf(String str) — возвращает индекс в данной строке первого
  вхождения указанной подстроки. Если эта подстрока не встречается, возвращается -1.

  int indexOf(String str, int fromIndex) — возвращает индекс
  в данной строке первого вхождения указанной подстроки, начиная
  с указанного индекса. Если не встречается, возвращается -1.

**************************************************************
Синтаксис метода:

  public int indexOf(int ch )

  или

  public int indexOf(int ch, int fromIndex)

  или

  int indexOf(String str)

  или

  int indexOf(String str, int fromIndex)

**************************************************************
Подробная информация о параметрах:

  ch — символ;
  fromIndex — индекс, чтобы начать поиск (от);
  str — строка.
*/


        String Str = new String("Добро пожаловать на ProgLang.su");
        String SubStr1 = new String("Prog");
        String SubStr2 = new String("Srog");

        // первое вхождение
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf('о'));

        // после 5 индекса найдено совпадение на 7-мом индексе
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf('о', 5));

        // с 20 индекса найдено совпадение в SubStr1
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf(SubStr1));

        // с 21 индекса не найдено совпадений в SubStr1
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf(SubStr1, 21));

        // в Str не содежиться SubStr2, нет совпадений
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf(SubStr2));



        /*
        Найденный индекс: 1
        Найденный индекс: 7
        Найденный индекс: 20
        Найденный индекс: -1
        Найденный индекс: -1
        */
    }
}
