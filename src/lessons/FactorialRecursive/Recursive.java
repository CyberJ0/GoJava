package lessons.FactorialRecursive;

public class Recursive {

    int methodRecursive(int x) {
        int result;
        if (x == 1) return 1;
        return result = methodRecursive(x - 1) * x;
    }

    public static void main(String[] args) {
        Recursive recursObj = new Recursive();

        System.out.println(recursObj.methodRecursive(5));
    }
}


// 5! = 4 * 5
// 4! = 3 * 4
// 3! = 2 * 3
// 2! = 1 * 2
// 1! = 1 * 1
// 0! = 1 * 1