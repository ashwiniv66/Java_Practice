package org.java.Java8_Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount{
    public static void main(String[] args) {
        // word count of each items in the list
        List<String> words = Arrays.asList("apple","orange","kiwi","jackfruit","apple","orange",
                "kiwi","mango","orange","kiwi","apple","orange","banana");
        Map<String,Long> map = words.stream().
                                 collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

        //count second most frequent word in list
        Optional<Map.Entry<String,Long>> second = map.entrySet()
                .stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                        .skip(1).findFirst();
        System.out.println(second);
    }
}
