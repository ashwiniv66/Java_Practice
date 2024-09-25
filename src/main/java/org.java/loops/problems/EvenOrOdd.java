package org.example.loops.problems;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n%2==0){
            System.out.println("Number is Positive" );
        }else{
            System.out.println("Number is Odd");
        }
    }
}
