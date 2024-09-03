package designpattern.creational.abstractfactorydp;

public class BreezaCarFactory extends MarutiCarFactory{
    @Override
    Car getCar(CarType carType) {
        return new Breeza();
    }
}
