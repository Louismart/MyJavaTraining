package abstraction;

public abstract class Bird extends Animal implements Canfly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");

    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat ");

    }

    @Override
    public void fly() {
        System.out.println(getClass() + " is is flapping its wings");
    }
}
