package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Streams {
    public static void main(String[] args) {

        Arrays.asList("red", "green", "blue")
                .stream()
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        //example of Stream.of with filter
        Stream.of("apple", "pear", "banana", "cherry", "apricot")
                .filter(fruit -> fruit.startsWith("a"))
                .forEach(fruit -> System.out.println("Starts with A: " + fruit));

        //using a stream and map operation for create a list of words in caps
        List<String> collected = Stream.of("Java", "Rocks")
                .map(string -> string.toUpperCase())
                .collect(toList());
        System.out.println(collected.toString());
    }
}
