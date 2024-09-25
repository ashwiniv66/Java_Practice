package org.example.loops.problems;

import java.util.Scanner;

//1. Write a Java program to get a number from the user and print whether it is positive or negative.
//
// Test Data
//Input number: 35
//Expected Output :
//Number is positive
public class PostiveOrNegative {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Input Number : ");
        int n = scan.nextInt();

        if (n>0){
            System.out.println("Number is positive");
        }else if (n<0) {
            System.out.println("Number is Negative");
        }else{
            System.out.println("Number is Zero");
        }



    }
}
