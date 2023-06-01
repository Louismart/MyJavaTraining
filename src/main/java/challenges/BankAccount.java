package challenges;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerPhoneNumber;
    private String customerEmailAdress;

    public BankAccount(String customerName, String accountNumber, String phoneNumber, String customerEmail, double accBalance) {

        this.accountNumber = accountNumber;
        this.balance = accBalance;
        this.customerName = customerName;
        this.customerPhoneNumber = phoneNumber;
        this.customerEmailAdress = customerEmail;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerEmailAdress() {
        return customerEmailAdress;
    }

    public void setCustomerEmailAdress(String customerEmailAdress) {
        this.customerEmailAdress = customerEmailAdress;
    }

    public void depositFunds(double depositAmount) {

        balance = balance + depositAmount;

        System.out.println("The current deposit is: " + "" + balance );
    }

    public void withdrawFunds(double withdrawalAmount) {

        if ((balance - withdrawalAmount <= 0)) {

            System.out.println("You cannot withdrowal that summ, quote is insufficient");
        }
        else {
            balance = balance - withdrawalAmount;
            System.out.println("The balance after Withdrowal : " + "" + balance);

        }
    }

    public void actualBalance(int ballance) {

        System.out.println("");
    }
}
