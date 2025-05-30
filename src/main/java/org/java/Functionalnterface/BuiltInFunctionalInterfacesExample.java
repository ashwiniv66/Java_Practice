package org.java.Functionalnterface;

import java.util.function.Function;
import java.util.function.Predicate;

import java.util.function.*;

public class BuiltInFunctionalInterfacesExample {

    public static void main(String[] args) {

        // Predicate<T> ---> boolean
        // boolean test(T t)
        // Predicate<T>: checks if a number is even
        //Predicate used for conditions where the output returns in true/false
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10)); // Output: true

        // Function<T, R> ---> R
        // R apply(T t)
        // Function<T, R>: converts a String to its length
        // use when you want return type of your wish
        // T is datatype
        // R is return type
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Java': " + stringLength.apply("Java")); // Output: 4

        // Consumer<T> ---> void
        // void accept(T t)
        // Consumer<T>: prints a message
        Consumer<String> greeter = name -> System.out.println("Hello, " + name + "!");
        greeter.accept("Alice"); // Output: Hello, Alice!

        // Supplier<T>: supplies a random number
        //T get()
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println("Random number: " + randomNumber.get());

        // BinaryOperator<T>: sums two integers
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println("Sum of 5 and 3: " + sum.apply(5, 3)); // Output: 8
    }
}
