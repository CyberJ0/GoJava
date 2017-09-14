package lessons.GetSetMethodsContructor;

public class Computer {
    private String OS;
    private int hdd, ram, cpu;
    private float weight;

    /**
     * В этом методе заменим стандартный вывод
     */
    private void print(String str) {
        System.out.println(str);
    }

    /**
     * Стандартный конструктор
     */
    // предположим что при старте программы компьютер всегда включен
    Computer() {
        on();
    }

    /**
     * Конструктор по всем переменным (ALT + INS)
     */
/*    public Computer(String OS, int hdd, int ram, int cpu, float weight) {
        this.OS = OS;
        this.hdd = hdd;
        this.ram = ram;
        this.cpu = cpu;
        this.weight = weight;
    }*/

    /**
     * Методы get и set
     */
    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
        if (OS.trim().equals("")) {
            print("Необходимо ввести операционную систему компьютера");
        } else {
            print("Вы счастливый обладатель \"" + OS + "\" системы.");
        }
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
        if (hdd <= 0) {
            print("Введенные данные HDD некорректны: " + hdd + "гб");
        } else {
            print("HDD вместимостью: " + hdd + " гб");
        }
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
        if (ram <= 0) {
            print("Память не может быть: " + ram + " мб");
        } else {
            print("Объем ram : " + ram + " мб");
        }
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
        if (cpu <= 0 || cpu >= 16) {
            print("Ядерность процессора не может быть: " + cpu + " ядер");
        } else {
            print("CPU имеет: " + cpu + " ядер");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        if (weight <= 1 || weight >= 60) {
            print("Системный блок ПК не может весить: " + weight + " кг");
        } else {
            print("Вес системного блока ПК составляет: " + weight + " кг");
        }
    }


    /**
     * Стандартные методы
     */
    public void on() {
        print("Компьютер включен!");
    }

    public void reboot() {
        if (hdd <= 0 || ram <= 0 || cpu <= 0 || cpu >= 16 || weight >= 60 || weight <= 1) {
            print("Обнаружена ошибка(!) Компьютер будет перезагружен.");
        } else {
            print("Компьютер имеет стабильные показатели.");
        }
    }
}
