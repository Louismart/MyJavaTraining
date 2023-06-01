package mathLogic;

public class FizzBuzzCalc {

    public static void main(String[] args) {


        String originalStr = "123";
        String str1 = String.copyValueOf(originalStr.toCharArray()); //false
        String str2 = String.valueOf(123); //false
        String str3 = String.valueOf("123");  //true
        String str4 = String.valueOf(originalStr); //true
        String str5 = new String("123"); //false

        if (originalStr == str1) {
            System.out.println("Strings are equal 1 ");
        } else {
            System.out.println("False 1");
        }
        if (originalStr == str2) {
            System.out.println("Strings are equal 2");
        } else {
            System.out.println("False 2");
        }
        if (originalStr == str3) {
            System.out.println("Strings are equal 3");
        } else {
            System.out.println("False 3");
        }
        if (originalStr == str4) {
            System.out.println("Strings are equal 4");
        } else {
            System.out.println("False 4");
        }
        if (originalStr == str5) {
            System.out.println("Strings are equal 5");
        } else {
            System.out.println("False 5");
        }

    }
}

