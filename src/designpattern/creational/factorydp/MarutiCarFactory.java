package designpattern.creational.factorydp;

public class MarutiCarFactory {

    public Car getCar(CarType carType){

        switch (carType) {
            case SEDAN:
                return new Ciaz();

            case SUV:
                return new Breeza();
        }
        return null;
    }

}
