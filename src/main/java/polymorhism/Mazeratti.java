package polymorhism;

public class Mazeratti extends Car {

    public Mazeratti(String producer, int cylinders) {
        super(producer, cylinders);
    }
    @Override
    public String startEngine() {
        return "Mazeratti -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mazeratti -> startEngine()";
    }

    @Override
    public String brake() {
        return "Mazeratti -> startEngine()";
    }
}
