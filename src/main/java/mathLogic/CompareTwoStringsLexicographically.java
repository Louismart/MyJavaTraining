package mathLogic;

public class CompareTwoStringsLexicographically {
    public static int isCompareTo(String str1, String str2) {

        // Compare the two strings.
        int result = str1.compareTo(str2);

        // Display the results of the comparison.
        if (result < 0) {
            return -1;
        } else if (result == 0) {
            return 1;
        } else // if (result > 0)
        return -1;
    }

    public static void main(String[] args) {
        String oldVer = "2.0.5";
        String newVer = "4.2.3";

        System.out.println("Old version: " + oldVer);
        System.out.println("New version: " + newVer);

        System.out.println(isCompareTo(oldVer, newVer));
    }
}



