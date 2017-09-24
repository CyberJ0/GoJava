package lessons.Polymorphism.Animal;

public class MainTest {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        dog1.bark();

        test(animal1);
        test(dog1);
        test(cat1);
    }
    public static void test(Animal animal) {
        animal.eat();
    }
}
