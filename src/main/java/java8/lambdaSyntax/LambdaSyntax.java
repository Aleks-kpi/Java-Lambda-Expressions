package java8.lambdaSyntax;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class LambdaSyntax {

    public static void main(String[] args) {

        // Anonymous Inner Class: Runnable
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run 1");
            }
        };

        // Lambda version of Runnable (no arguments)
        Runnable r2 = () -> System.out.println("run 2");

        // Starts both threads
        r1.run();
        r2.run();

        //using an existing functional interface BiFunction
        BiFunction<String, String, String> concat = (a, b) -> a + b;
        String sentence = concat.apply("Today is ", "a great day");
        System.out.println(sentence);

        //example of the Consumer functional interface
        Consumer<String> hello = name -> System.out.println("Hello, " + name);
        for (String name : Arrays.asList("Duke", "Mickey", "Minnie")) {
            hello.accept(name);
        }

        //example of passing one value
        GreetingFunction greeting = message -> System.out.println("Java Programming " + message);
        greeting.sayMessage("Rocks with lambda expression");

        GreetingFunction grt = new GreetingFunction() {
            @Override
            public void sayMessage(String message) {
                System.out.println(message);
            }
        };

        grt.sayMessage("Hello Java");
    }

    //custom functional interface
    @FunctionalInterface
    interface GreetingFunction {
        void sayMessage(String message);
    }
}
