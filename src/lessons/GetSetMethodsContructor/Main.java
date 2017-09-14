package lessons.GetSetMethodsContructor;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer();

        /**
         * Играемся меняя значения ниже
         */
        comp.setOS("Ubuntu"); // тут меняем оперативную систему
        comp.setCpu(6); // тут меняем количество ядер процессора
        comp.setHdd(250); // тут меняем объем венчестера
        comp.setRam(1024); // тут меняем оперативную память
        comp.setWeight(10.3f); // тут меняем вес ПК
        comp.reboot(); // тут проверка системы на ошибки и виртуальная "перезагрузка системы"
    }
}
