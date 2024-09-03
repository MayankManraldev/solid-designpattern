package designpattern.creational.abstractfactorydp;

public class Main {
    public static void main(String[] args) {
       MarutiCarFactory marutiCarFactory=new BreezaCarFactory();
        Car car = marutiCarFactory.getCar(CarType.SUV);
        System.out.println("Car " + car.getClass().getName() +
                " has " + car.getEngine() +
                " with price " + car.getPrice());

    }
}