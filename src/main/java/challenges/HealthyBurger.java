package challenges;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");

    }
    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHumburger() {
        double humburgerPrice = super.itemizeHumburger();
        if(this.healthyExtra1Name != null) {
            humburgerPrice += this.healthyExtra1Price;
            System.out.println(" Added " + this.healthyExtra1Name + " fot an extra " + this.healthyExtra1Price);
        }
        if(this.healthyExtra2Name != null) {
            humburgerPrice += this.healthyExtra2Price;
            System.out.println(" Added " + this.healthyExtra2Name + " fot an extra " + this.healthyExtra2Price);
        }
        return humburgerPrice;
    }
}
