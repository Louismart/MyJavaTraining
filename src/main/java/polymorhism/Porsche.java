package polymorhism;

public class Porsche extends Car {

    public Porsche(String producer, int cylinders) {
        super(producer, cylinders);
    }
    @Override
    public String startEngine() {
        return getClass().getName() + "-> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getName() +"-> startEngine()";
    }

    @Override
    public String brake() {
        return getClass().getName() + "-> startEngine()";
    }
}
