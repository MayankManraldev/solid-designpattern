package designpattern.creational.builderdp;

public class Car {

    int engineCC;
    int modelYear;

    String carName;

    public int getEngineCC() {
        return engineCC;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String getCarName() {
        return carName;
    }

    private Car(Builder builder){
    this.carName=builder.carName;
    this.engineCC=builder.engineCC;
    this.modelYear=builder.modelYear;
    }

    static class Builder{
        int engineCC;
        int modelYear;

        String carName;

        public void setModelYear(int modelYear) {
            this.modelYear = modelYear;
        }
        Builder(int engineCC,String carName){
            this.carName=carName;
            this.engineCC=engineCC;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
