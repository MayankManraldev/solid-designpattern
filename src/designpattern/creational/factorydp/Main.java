package designpattern.creational.factorydp;

public class Main {
    public static void main(String[] args) {
        MarutiCarFactory marutiCarFactory=new MarutiCarFactory();
        Car car = marutiCarFactory.getCar(CarType.SUV);
        System.out.println("Car " + car.getClass().getName() +
                " has " + car.getEngine() +
                " with price " + car.getPrice());


    }
}