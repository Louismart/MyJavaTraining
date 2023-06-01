package challenges;

public class BankTestClass {

    public static void main(String[] args) {

        BankAccount user1 = new BankAccount("Peter", "12544", "45854", "ff@re.be", 1500);

        //user1.depositFunds(50);

        // user1.withdrawFunds(10000);

        VipCustomer users1 = new VipCustomer();
        System.out.println(users1.getName() + " name " + users1.getCreditLimit() + " creditLimit " + users1.getEmailAddress() + " email ");

        VipCustomer users2 = new VipCustomer("Jack", 500);
        System.out.println(users2.getName() + " name " + users2.getCreditLimit() + " creditLimit " + users1.getEmailAddress() + " email " );

        VipCustomer users3 = new VipCustomer("Tim", 1500, "pop@kik.com");
        System.out.println(users3.getName() + " name " + users3.getCreditLimit() + " creditLimit " + users3.getEmailAddress() + " email " );

    }
}
