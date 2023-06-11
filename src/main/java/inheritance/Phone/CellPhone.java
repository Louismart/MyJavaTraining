package inheritance.Phone;

public class CellPhone extends WirelessPhone {

    public CellPhone(int year, int hour) {
        super(year, hour);
    }

    public void call(int outputNumber) {
        System.out.println("Call number " + outputNumber);
    }

    public void ring(int inputNumber) {
        System.out.println("Your number is calling " + inputNumber);
    }
}
