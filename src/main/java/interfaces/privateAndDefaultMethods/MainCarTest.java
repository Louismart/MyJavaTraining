package interfaces.privateAndDefaultMethods;

public class MainCarTest {
    public static void main(String[] args) {

        Vehicle car = new Car("BMW");
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        car.drive();  //Call method drive from Vehicle
        SportCar.drive();  // Call method drive from SportCar directly , because its static method
        SportCar.drive();  // Call method drive from SportCar directly , because its static method

    }
}
