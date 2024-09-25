package org.example.problems;

import java.util.Scanner;

public class Condition {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter first number: ");
            int a =sc.nextInt();
            System.out.println( a);
            int b= sc.nextInt();
            System.out.println( b);
            int c =sc.nextInt();
            System.out.println( c);
            int max =a;
            if(b>max)
            {
                max=b;
            }
            if (c>max)
            {
                max =c;
            }
            System.out.println(max);
            sc.close();

        }
    }

