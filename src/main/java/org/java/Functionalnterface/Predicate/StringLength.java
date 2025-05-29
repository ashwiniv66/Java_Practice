package org.java.Functionalnterface.Predicate;

import java.util.function.Predicate;

public class StringLength {
    public static void main(String[] args) {
        String[] str = {"Ashwini","Abhi","Bhumika","Bharat-Akshay"};
        Predicate<String> stringLength = s1 -> s1.length()>5;
        for(String s1 : str){
            if(stringLength.test(s1)){
                System.out.println(s1);
            }
        }

    }
}
