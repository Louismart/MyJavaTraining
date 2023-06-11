package inheritance.Phone;

public class PhoneTest {

    public static void main(String[] args) {

        String program = "iGO";

        WirelessPhone panasonic = new WirelessPhone(1985, 20) ;

        CellPhone nokia = new CellPhone(2005, 40);
        nokia.call(2266547);
        nokia.ring(665522);

        SmartPhone xiaomi = new SmartPhone(2020, 120, "Android");
        xiaomi.install("GoogleMaps");
        xiaomi.setOperationSystem("iOS");
        System.out.println("Installing " + program + " "+ "for" + " "+ xiaomi.getOperationSystem());

    }
}
