package interfaces.challenge1;

public class Parrot implements Animal, Bird {

    @Override
    public void eat() {
        System.out.println("Parrot blala up 100");
    }

    @Override
    public void makeSound() {
        System.out.println("Parrots make sound of screech");
    }

    @Override
    public void fly() {
        System.out.println("Parrots can fly up to 50");
    }
}
