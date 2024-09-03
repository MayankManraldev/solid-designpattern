package designpattern.creational.abstractfactorydp;


public class CiazCarFactory extends MarutiCarFactory {

    @Override
    Car getCar(CarType carType) {
        return new Ciaz();
    }
}
