package methodReferenceChallege;

public class MainCarTest {
    public static void main(String[] args) {

        Car car1 = new Car("Audi");
        System.out.println(car1.hashCode());

        Car car2 = new Car("Audi");
        System.out.println(car2.hashCode());

//        car2=car1;
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

   //     System.out.println(car1.equals(car2));
        car1.setName("Opel");
        car2.setName("Citroen");

      //  car2 = car1; //true
        car2.setName("Opel");
        car1.setName("Mazda");
        car1.setName("VW");
        car2.setName("VW");



        System.out.println(car1.equals(car2));


    }
}
