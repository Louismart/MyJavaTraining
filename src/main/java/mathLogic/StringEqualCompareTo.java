package mathLogic;

public class StringEqualCompareTo {

    public static void main(String[] args) {

        // How many object are created?
        //Case 1
        String str1 = "I am Java expert";
        String str2 = "I am C expert";
        String str3 = "I am Java expert";

       //Case 2
        String str4 = new String("I am Java expert");
        String str5 = "I am C expert";
        String str6 = "I am Java expert";


        str4 = "Honey";
        str6 = "Honey";

// Resolve all lines with False or True
//        System.out.println((str1.equals(str3))); //true
//        System.out.println((str1.equals(str2))); //false
//        System.out.println((str2.equals(str3))); //false
//        System.out.println(str1==str3); // true
//        System.out.println(str1==str2); //false
//        System.out.println(str2==str3); // false

        System.out.println((str4.equals(str6))); //true
        System.out.println((str4.equals(str5))); //false
        System.out.println((str5.equals(str6))); // false
        System.out.println(str4==str6); //true
        System.out.println(str4==str5); // false
        System.out.println(str5==str6); // false
    }
}
