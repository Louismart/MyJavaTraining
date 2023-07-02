package mathLogic;


public class StringDuplicates {


    public static void main(String[] args) {
        String s = "abcdefga";

        System.out.print(check(s));
    }

    //Detect duplicate character in String
    public static boolean check(CharSequence g) {
        for (int i = 0; i < g.length(); i++) {
            for (int j = i + 1; j < g.length(); j++) {
                 if (g.charAt(i) == g.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
