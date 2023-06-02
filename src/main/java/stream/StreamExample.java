package stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

    /*  //1. Integer Stream
        IntStream
                .range(1,10)
                .forEach(System.out::println);
        System.out.println();
    }
        //2. Integer Stream with skip
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));

        //3. Integer Stream with sum
        System.out.println(
        IntStream
                .range(1, 5)
                .sum());
        System.out.println();   */

        //4. Stream.of, sorted and FindFirst
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
