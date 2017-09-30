package lessons.Arrays.ListArray;

import java.util.ArrayList; // добавляем библиотеку

public class MainArrayList {
    public static void main(String[] args) {
        //ArrayList<Integer> guests = new ArrayList<Integer>(); // объявили лист массива целочисленного (int) типа
        ArrayList<String> guests = new ArrayList<>(); // объявили лист массива строкового типа

        guests.add("Fedor"); // добавили гостя в массив
        guests.add("Alisa");
        guests.add("Hodor");
        guests.add("Vasilisa");
        guests.add("Ignat");

        //guests.set(1, "Veronika"); // заменить в массиве значение [1] на новое, то есть: Alisa на Veronika
        //guests.remove(2); // удалить по индексу [?]
        //guests.remove("Ignat"); // удалить по имени / строке
        //guests.clear(); // удалить (очистить) массив

        int a = guests.indexOf("Hodor") + 1; // +1 для адекватного отображения числа (массив начинается с ноль)
        System.out.println("Hodor пришел в гости: " + a + "\n");

        //System.out.println("Первый гость " + guests.get(0));
        System.out.println("Всего приглашено " + guests.size() + " гостей.");

//      Перебираем с помощью for
//        for (int i = 0; i < guests.size(); i++) { // guests.size размер массива (!) не length !!!
//            System.out.println(guests.get(i)); // перечисление гостей guests.get(i)
//        }

//      Перебираем грамотно с помощью foreach
        for (String i : guests ) {
            System.out.println(i); // перечисление гостей
        }
    }
}
