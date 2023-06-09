package interfaces.privateAndDefaultMethods;

public class TestClass implements Vehicle, Auto {

    public static void main(String[] args) {

        Vehicle vehicle = new TestClass();
        vehicle.drive();
        Auto.drive();

    }


}
