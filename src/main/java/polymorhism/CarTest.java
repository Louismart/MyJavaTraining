package polymorhism;

public class CarTest {

    public static void main(String[] args) {

        Car car = new Car("BMW", 4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println();


        Ferrari ferrari = new Ferrari("F8", 8);
        System.out.println(ferrari.startEngine());
        System.out.println(ferrari.accelerate());
        System.out.println(ferrari.brake());

        System.out.println();

        Mazeratti mazeratti = new Mazeratti("Quatroporte", 8);
        System.out.println(mazeratti.startEngine());
        System.out.println(mazeratti.accelerate());
        System.out.println(mazeratti.brake());

        System.out.println();

        Porsche porsche = new Porsche("boxer", 8);
        System.out.println(porsche.startEngine());
        System.out.println(porsche.accelerate());
        System.out.println(porsche.brake());

    }
}
