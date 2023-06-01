package challenges;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipCustomer() {

        this("Default name", 1000, "default@bk.te");
//        this.name1 = name1;
//        this.creditLimit = creditLimit;
//        this.emailAddress = emailAddress;

    }public VipCustomer(String name, double creditLimit) {

        //this(name2,creditLimit, "en@hot.com");

        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = "unknown@hot.com";

    }
    public VipCustomer(String name, double creditLimit, String emailAddress) {

        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;

    }
}
