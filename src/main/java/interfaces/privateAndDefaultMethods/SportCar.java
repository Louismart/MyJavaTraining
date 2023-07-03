package interfaces.privateAndDefaultMethods;

public interface SportCar  {

    static void drive() {
        System.out.println("SportCar can drive");
        signal();
    }

    private static void signal() {
        System.out.println("SportCar can Bi-Bip");
    }
}
