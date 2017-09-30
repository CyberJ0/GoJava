package lessons.FactorialRecursive;

public class Factorial {
    public static void main(String[] args) {

        int fact = 1;
        int num = 5;
        for (int i = num; i >= 1; i--) {
            fact *= i;
            System.out.println(fact);
        }
        System.out.println("Итого " + fact);
    }
}
// 5! = 1 * 2 * 3 * 4 * 5 (120)
// Происходит следующее,
// на первой итерации получаем число 5, (1 * 5 = 5)
// на второй 20 (5 * 4 = 20)
// на третьей 60 (20 * 3 = 60)
// на четвертой  120 (60 * 2 = 120)
// пока 2 > 1, конец цикла
