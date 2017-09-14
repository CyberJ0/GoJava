package lessons.Nasledovanie;

public class Car {
    public static void main(String[] args) {
        Bmw x6 = new Bmw();
        x6.nameBMW();
        x6.door3();
        x6.enginePetrolAuto();

        Ford Mustang = new Ford();
       // Mustang.nameFord();
        Mustang.nameBMW();
        Mustang.door5();
        Mustang.engineDiselAuto();
    }
}
