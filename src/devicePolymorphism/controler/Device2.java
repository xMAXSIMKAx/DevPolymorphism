package devicePolymorphism.controler;

import devicePolymorphism.Model.Device;

public class Device2 implements Device {
    private static final double CONSTANT_COEFFICIENT = 2.0;
    @Override
    public double calculateResult(double dev1, double dev2) {
        double sum =  dev1 + dev2;
        return sum * CONSTANT_COEFFICIENT;
    }
}
