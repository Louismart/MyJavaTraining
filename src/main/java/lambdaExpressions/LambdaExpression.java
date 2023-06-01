package lambdaExpressions;

public class LambdaExpression {

    public static void main(String[] args) {

        MyFunction myFunction = (text1, text2) -> {
            System.out.println(text1 + " + " + text2);
            return (text1 + " + " + text2);
        };

        String returnValue = myFunction.apply("Hello function body", "Test");
        System.out.println(returnValue);

        MyFunction myFunction2 = myFunction;
        String returnValue2 = myFunction2.apply("Text 1", "Text 2");
        System.out.println(returnValue2);

        MyFunction myFunction3 = myFunction;
        String returnValue3 = myFunction3.apply("Text 3", "Text 4");
        System.out.println(returnValue3);

    }
}
