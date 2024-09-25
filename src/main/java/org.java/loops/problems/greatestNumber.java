package org.example.loops.problems;

import java.util.Scanner;

//3. Write a Java program that takes three numbers from the user and prints the greatest number.
//
//Test Data
//Input the 1st number: 25
//Input the 2nd number: 78
//Input the 3rd number: 87
//Expected Output :
//The greatest: 87
public class greatestNumber {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Enter the 1st Number : ");
        int a = scan.nextInt();
        System.out.println("Enter the 2nd Number : ");
        int b = scan.nextInt();
        System.out.println("Enter the 3rd Number : ");
        int c = scan.nextInt();

        if(a>b && a>c){
            System.out.print("The 1st Number is greatest: ");
            System.out.println(a);
        } else if (b>a && b>c) {
            System.out.print("The 2nd Number is greatest: ");
            System.out.println(b);
        }else{
            System.out.print("The 3rd Number is greatest: ");
            System.out.println(c);
        }
    }
}
