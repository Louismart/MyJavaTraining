package polymorhism;

public class Ferrari extends Car {

    public Ferrari(String producer, int cylinders) {
        super(producer, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ferrari -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ferrari -> startEngine()";
    }

    @Override
    public String brake() {
        return "Ferrari -> startEngine()";
    }
}
