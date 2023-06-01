package challenges;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 15.54, "White");
        super.addHumburgerAddition1("Chips", 2.75);
        super.addHumburgerAddition2("Drink", 1.82);
    }
    @Override
    public void addHumburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
    @Override
    public void addHumburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
    @Override
    public void addHumburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHumburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");

    }
}
