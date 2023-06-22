package interfaces.functionalInterface;

import interfaces.functionalInterface.Square;

public class IntMain {

    public static void main(String[] args) {
        int a = 5;

        Square s = (int x) -> x * x;

        int ans = s.calculate(a);
        System.out.println(ans);
    }


}
