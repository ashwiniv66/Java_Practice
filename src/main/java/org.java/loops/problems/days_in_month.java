package org.example.loops.problems;

import java.util.Scanner;

//7. Write a Java program to find the number of days in a month.
//
//Test Data
//Input a month number: 2
//Input a year: 2016
//Expected Output :
//February 2016 has 29 days
public class days_in_month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a month number: ");
        int month = input.nextInt();

        System.out.println("Input a year: ");
        int year = input.nextInt();

        int days = getDaysInaMonth(month,year);

        if (days == -1) {
            System.out.println("Invalid month entered.");
        } else {
            System.out.println("Number of days in month " + month + " of year " + year + " is: " + days);
        }

        input.close();
    }

    public static int getDaysInaMonth(int month , int year){
      switch (month){
          case 1: case 3: case 5: case 7: case 9: case 11:
              return 31;
          case 4: case 6: case 8: case 10: case 12:
              return 30;
          case 2 :
              return leapYear(year) ? 29 : 28;
          default:
              return -1;
      }
    }

    public static boolean leapYear(int year){
        if(year % 4 ==0){
            if(year % 100 == 0){
                return year % 400 == 0;
            }
            return true ;
        }
        return false;
    }

}
