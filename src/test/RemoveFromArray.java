package test;

public class RemoveFromArray {
    public static void main(String[] args) {
        /** вариант №1 удалить по значению*/
//        int i = 0;
//        int x = 0;
//        int[] oldArray = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(oldArray));
//        int[] intArray = new int[oldArray.length - 1];
//        while (i < oldArray.length) {
//            if (oldArray[i] == 3) i++;
//
//            intArray[x] = oldArray[i];
//            i++;
//            x++;
//            System.out.println(Arrays.toString(intArray));
//    }

        /**
         * вариант №2 удалить по индексу... нельзя вывести без Arrays.toString()
         */
//        int a[] = {1, 2, 3};
//        a = Arrays.copyOf(a, 2);
//        System.out.println(Arrays.toString(a));

        /** вариант №3 удалить по индексу*/
//        int size = 3;
//        String[] names = {"Николай", "Игорь", "Валентина", "Снежанна"};
//        String[] newNames = new String[size];
//        int position = 0;
//        for (int i = position; i < size; i++) {
//            names[i] = names[i + 1];
//        }
//        for (int i = 0; i < size; i++) {
//            newNames[i] = names[i];
//            System.out.println(newNames[i]);
//        }

    }

//     /** (!) */ //не проверял
//    public static int[] removeElement(int[] original, int element){
//        int[] n = new int[original.length - 1];
//        System.arraycopy(original, element+1, n, element, original.length - element-1);
//        return n;
//    }
}
