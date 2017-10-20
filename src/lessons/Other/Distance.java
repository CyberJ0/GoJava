package lessons.Other;

import java.util.Scanner;

public class Distance {
    private double initialDistance, traveledDistance, totalDistance;

    void setDistance(double a, double b) {
        initialDistance = a;
        traveledDistance = b;
        if(initialDistance <= 0 || traveledDistance <= 0){
            System.out.println("Введенные данные не коректны");
        }else{
            System.out.println("Дистанци: " + initialDistance + " метров");
            System.out.println("Пройденное расстояние: " + traveledDistance + " метров");
        }
    }

    double getDistance() {
        totalDistance = initialDistance - traveledDistance;
        return totalDistance;
    }

    public static void main(String[] args) {
        Distance dt = new Distance();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите общую дистанцию:");
        double initial = scan.nextDouble();
        System.out.println("Введите пройденную дистанцию:");
        double travel = scan.nextDouble();

        double total = 100 - (travel / initial * 100);


        System.out.println("Осталось пройти: " + String.format("%.2f", total) + "%");

        System.out.println("\nРаботает метод getDistance2");
        dt.setDistance(50, 35);
        System.out.println("Осталось пройти: " + dt.getDistance() + " метров");


    }
}
