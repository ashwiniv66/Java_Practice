package org.example.loops.problems;

import java.util.Scanner;

//6. Write a Java program that reads two floating-point numbers
// and tests whether they are the same up to three decimal places.
//
//Test Data
//Input floating-point number: 25.586
//Input floating-point another number: 25.589
//Expected Output :
//They are different
public class comparing_decimal_places {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input floating-point number: ");
        double a = input.nextDouble();
        System.out.println("Input floating-point another number: ");
        double b = input.nextDouble();

        a = Math.round( a * 1000);
        a = a / 1000;
        b = Math.round( b * 1000);
        b = b / 1000;
        if(a == b){
            System.out.println("They are the same up to three decimal places");
        }else{
            System.out.println("They are different");
        }
        input.close();
    }

}
