package org.example.loops.problems;

import java.util.Scanner;

//2. Write a Java program to solve quadratic equations (use if, else if and else).
//a square(x) + bx +c = 0;
//Test Data
//Input a: 1
//Input b: 5
//Input c: 1
//Expected Output :
//The roots are -0.20871215252208009 and -4.7912878474779195
public class quadraticEquation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c  = scan.nextDouble();

        if(a != 0 && b!=0 && c!=0){
            System.out.println("solve" );
        }

    }
}
