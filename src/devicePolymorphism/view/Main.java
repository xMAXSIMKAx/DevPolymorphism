package devicePolymorphism.view;

import devicePolymorphism.Model.Device;
import devicePolymorphism.controler.Device1;
import devicePolymorphism.controler.Device2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter parameter 1: ");
        double dev1 = scanner.nextDouble();
        System.out.println("Enter parameter 2: ");
        double dev2 = scanner.nextDouble();

        Device device1 = new Device1();
        Device device2 = new Device2();

        double res1 = device1.calculateResult(dev1,dev2);
        System.out.println(" Device number 1 result " + res1);

        double res2 = device2.calculateResult(dev1,dev2);
        System.out.println(" Device number 2 result " + res2);
    }
}