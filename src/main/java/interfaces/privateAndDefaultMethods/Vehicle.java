package interfaces.privateAndDefaultMethods;

public interface Vehicle {

    String getBrand();
    String speedUp();
    String slowDown();

    default void drive() {
        System.out.println("Vehicle can drive");
        signal();
    }

    private void signal() {
        System.out.println("Vehicle can Bi-bip");
    }

}
