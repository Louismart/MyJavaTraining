package methodReferenceChallege;

import java.util.ArrayList;
import java.util.List;

public class MainCarTest {
    public static void main(String[] args) {

   /*     int x;
        int y = 10;

        x = 5;
        x = y;
        y = 20;


        System.out.println("x= " + x + " " + "y= " + y);

    */
        String str1 = new String("BMW");
        String str2 = "BMW";





        Car car1 = new Car("Audi");
     //   System.out.println(car1.hashCode());

        Car car2 = new Car("Audi");
     //   System.out.println(car2.hashCode());

        car2=car1;
//        System.out.println(car1.hashCode());
//        System.out.println(car2.hashCode());

        //     System.out.println(car1.equals(car2));
        car1.setName("Opel");
        car2.setName("Citroen");
//
//        car2 = car1; // if the object reference is occurring , then 1 object always equals to 2 object  [true], despite of subsequent changes made
//        car2.setName("Opel");
//        car1.setName("Mazda");
//        car1.setName("VW");
//        car2.setName("VW");


//        System.out.println(car1.equals(car2));
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

//        System.out.println(car1.equals(car2));
//        System.out.println(car1 == car2);



    }
}
