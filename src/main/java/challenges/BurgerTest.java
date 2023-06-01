package challenges;

public class BurgerTest {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
    //humburger.itemizeHumburger();
        hamburger.addHumburgerAddition1("Tomato",0.27);
        hamburger.addHumburgerAddition2("lettuce",0.75);
        hamburger.addHumburgerAddition3("Cheese",1.13);
        System.out.println(" Total Burger pice is "+hamburger.itemizeHumburger());

        System.out.println();

    HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
    //healthyBurger.itemizeHumburger();
        healthyBurger.addHealthAddition1("Egg",5.43);

        healthyBurger.addHealthAddition2("Lentils",3.41);
        System.out.println(" Total HealthyBurger pice is "+healthyBurger.itemizeHumburger());

        System.out.println();

    DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHumburger();
        deluxeBurger.addHumburgerAddition3(" Should not do this",50.53);

}
}

