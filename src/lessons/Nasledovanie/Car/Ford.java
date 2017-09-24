package lessons.Nasledovanie.Car;

    public class Ford extends Bmw {

        /** Наследование */
        // в классе указываем: класс Ford (наследует = extends) от BMW
        //void nameFord() {
        //    System.out.print("Я FORD");
        //}

        /** Полиморфизм */
        // Берем имя от BMW но оно говорит что это форд Mustang.nameBMW();
        @Override
        void nameBMW() {
            System.out.print("FORD: конструктор");
        }
    }
