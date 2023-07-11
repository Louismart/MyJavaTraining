package mathLogic;

public class StringEqualCompareTo {

    public static void main(String[] args) {

        String str1 = "KANAVAS";
        String str2 = "KANAVAS";

        String str3 = "Any";
        String str4 = new String("Any");



        System.out.println((str3.equals(str4)));  //check if the 2 Strings are equal
        System.out.println(str1.compareTo(str2)); //compare String with anotherString lexicographically
    }
}
