package interfaces.privateAndDefaultMethods;

public class TestClass implements Vehicle, Auto {

    public static void main(String[] args) {

        Vehicle testClass = new TestClass();
        testClass.drive();
        Auto.drive();

    }


}
