package mathLogic;

public class StringEqualCompareTo {

    public static void main(String[] args) {

        String str1 = "KANAVAS";
        String str2 = "KANAVAS";

        String str3 = new String();



        System.out.println((str1.equals(str2)));  //check if the 2 Strings are equal
        System.out.println(str1.compareTo(str2)); //compare String with anotherString lexicographically
    }
}
