package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
//        integerStream1();
//        integerStreamSkip2();
//        integerStreamSum3();
//        sortedStream4();
        arrayStream5();

    }
        public static void integerStream1() {
      //1. Integer Stream
        IntStream
                .range(1,10)
                .forEach(System.out::println);
        System.out.println();
    }

    public static void integerStreamSkip2() {
        //2. Integer Stream with skip
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));
    }

    public static void integerStreamSum3() {
        //3. Integer Stream with sum
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum());
        System.out.println();

    }

        public static void sortedStream4() {
        //4. Stream.of, sorted and FindFirst
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }

    public static void arrayStream5() {
        //5. Stream from Array, sort, filter and print
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sandra"};
        Arrays.stream(names)  //same as the Stream.of(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
    }
}
