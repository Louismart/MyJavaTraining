package polymorhism;

public class Car {

    private String producer;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String producer, int cylinders) {
        this.producer = producer;
        this.cylinders = cylinders;

        this.engine = true;
        this.wheels = 4;
    }

    public String getProducer() {
        return producer;
    }


    public int getCylinders() {
        return cylinders;
    }


    public String startEngine() {
        return "Car -> startEngine()";

    }

    public String accelerate() {
        return "Car -> accelerate()";

    }
    public String brake() {
        return "Car -> brake()";

    }
}
