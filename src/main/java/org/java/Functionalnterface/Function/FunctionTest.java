package org.java.Functionalnterface.Function;

import java.util.Locale;
import java.util.function.Function;
//Function<T,R> ---> R type
public class FunctionTest {
    public static void main(String[] args) {
        Function<String,Integer> f = s->s.length();
        System.out.println(f.apply("Ashwini"));

        Function<String,String> uppercase = s-> s.toUpperCase(Locale.ROOT);
        System.out.println(uppercase.apply("Ashwini"));

        Function<Integer,Integer> f1 = i->i*2;
        Function<Integer,Integer> f2 = i->i*i*i;
        // in andThen operation f1 will be executed then f2 will be executed.
        System.out.println("andThen : " + f1.andThen(f2).apply(2));
        // in compose operation f2 will be executed first then followed with f1.
        System.out.println("compose method :  " + f1.compose(f2).apply(2));
    }
}
