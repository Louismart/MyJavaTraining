package methodReferenceChallege;

public class OddTest {
    public static void main(String[] args) {
        
        int num = doubleOdd(4);
        System.out.println(num);

    }

    public static int doubleOdd(int n) {

        if (n % 2 == 0)
            return n;
        else {
            int multiply = n * 2;
            return multiply;
        }

    }

}
