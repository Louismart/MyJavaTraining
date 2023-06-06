package stream;

import java.io.IOException;
import java.nio.file.Files;
 import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;

public class StreamExample {

    public static void main(String[] args) throws IOException {
//        integerStream1();
//        integerStreamSkip2();
//        integerStreamSum3();
//        sortedStream4();
//        arraySortedStream5();
//        averageSquares6();
//        listSortedStream7();
//        fromFileSortedStream8();
//        fromFileAndSaveStream9();
//        streamRowsCvsFileAndCount10();
//        streamRowsCvsFileAndParse11();
//        streamRowsCvsFileAndStoreInHashMap12();
//        reductionSum13();
        reductionSummaryStatistic14();

    }
    //1. Integer Stream
        public static void integerStream1() {
        IntStream
                .range(1,10)
                .forEach(System.out::println);
        System.out.println();
    }
    //2. Integer Stream with skip
    public static void integerStreamSkip2() {
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));
    }
    //3. Integer Stream with sum
    public static void integerStreamSum3() {
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum());
        System.out.println();

    }
    //4. Stream.of, sorted and FindFirst
        public static void sortedStream4() {
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
    //5. Stream from Array, sort, filter and print
    public static void arraySortedStream5() {
        String[] names = {"Ava", "Aneri", "Alberto", "Brent", "Sarika", "amanda", "Hans", "Shvika", "Radesh"};
        Stream.of(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
    }
    //6. Average of squares of an int array
    public static void averageSquares6() {
        Arrays.stream(new int[] {2,4,6,8,10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);
    }
    //7. Stream from List, filter and print
    public static void listSortedStream7() {
        List<String> people = Arrays.asList("Ava", "Aneri", "Alberto", "Brent", "Sarika", "amanda", "Hans", "Shvika", "Radesh");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);
    }
    //8. Stream rows from text file, sort, filter and print
    public static void fromFileSortedStream8() throws IOException {
        Stream<String> bands = lines(Paths.get("src\\main\\java\\stream\\bands.txt"));
        bands
                .sorted()
                .filter(x -> x.length() > 13)   //more then 13 char
                .forEach(System.out::println);
        bands.close();
    }
    //9. Stream rows from text file and save to List
    public static void fromFileAndSaveStream9() throws IOException {
        List<String> bands2 = Files.lines(Paths.get("src\\main\\java\\stream\\bands.txt"))
                .filter(x -> x.contains("jit"))
                .collect(Collectors.toList());
                 bands2.forEach(x-> System.out.println(x));
    }
    //10. Stream rows from CSV file and count
    public static void streamRowsCvsFileAndCount10() throws IOException {
        Stream<String>rows1 = Files.lines(Paths.get("src\\main\\java\\stream\\data.txt"));
        int rowCount = (int) rows1
                .map(x -> x.split(","))
                .filter(x -> x.length==3)
                .count();
        rows1.close();
        System.out.println(rowCount + " rows. ");
    }
    //11. Stream rows from CSV file and parse data from rows
    public static void streamRowsCvsFileAndParse11() throws IOException {
        Stream<String>rows2 = Files.lines(Paths.get("src\\main\\java\\stream\\data.txt"));
        rows2
                .map(x -> x.split(","))
                .filter(x -> x.length==3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
        rows2.close();
    }
    //12. Stream rows from CSV file and store fields in HashMap
    public static void streamRowsCvsFileAndStoreInHashMap12() throws IOException {
        Stream<String> rows3 = Files.lines(Paths.get("src\\main\\java\\stream\\data.txt"));
        Map<String, Integer> map = new HashMap<>();
        map = rows3
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])));
        rows3.close();
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
        //13. Reduction - sum
        public static void reductionSum13() throws IOException {
        double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double a, Double b) -> a + b);
            System.out.println("Total = " + total);
    }
    //14. Reduction - summary statistic
    public static void reductionSummaryStatistic14() throws IOException {
        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
                        .summaryStatistics();
        System.out.println(summary);
    }
}
