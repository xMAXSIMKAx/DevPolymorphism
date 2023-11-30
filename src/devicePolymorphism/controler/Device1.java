package devicePolymorphism.controler;

import devicePolymorphism.Model.Device;

public class Device1 implements Device {

    @Override
    public double calculateResult(double dev1, double dev2) {
        return dev1 * dev2;
    }
}
