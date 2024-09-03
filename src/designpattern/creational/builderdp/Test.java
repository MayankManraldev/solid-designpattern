package designpattern.creational.builderdp;

public class Test {
    public static void main(String[] args) {
        Car.Builder builder=new Car.Builder(2000,"SAFARI");
        builder.setModelYear(2024);
        Car car = builder.build();
        System.out.println("Car Name is "+car.getCarName()+
                " has "+car.getEngineCC()+" Engine"+
                " and model year is "+car.getModelYear());
    }
}
