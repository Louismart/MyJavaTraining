package interfaces.privateAndDefaultMethods;

public interface SportCar  {

    static void drive() {
        System.out.println("Auto can drive");
        signal();
    }

    private static void signal() {
        System.out.println("Auto can Bi-Bip");
    }
}
