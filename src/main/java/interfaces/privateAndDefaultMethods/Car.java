package interfaces.privateAndDefaultMethods;

public class Car implements Vehicle, SportCar {
    String brand;

    public Car(String brand) {
        this.brand = brand;
    }
    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "The Car is speeding up";
    }

    @Override
    public String slowDown() {
        return "The Car is slowing down";
    }

}

