package inheritance.carsChallenge;

public class VehicleTest {

    public static void main(String[] args) {

        Outlander outlander = new Outlander(36);
        outlander.headTo(5);
        outlander.headTo(2);
        outlander.headTo(1);
        outlander.setCurrentDirection(50);
        outlander.accelerate(30);
        outlander.move(50,20);
        outlander.accelerate(20);
        outlander.accelerate(-42);

    }
}
