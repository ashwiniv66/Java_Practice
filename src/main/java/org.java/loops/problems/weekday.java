package org.example.loops.problems;

import java.util.Scanner;
//5. Write a Java program that takes a number from the user and
// generates an integer between 1 and 7. It displays the weekday name.
//
//Test Data
//Input number: 3
//Expected Output :
//Wednesday
public class weekday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int day = input.nextInt();
        System.out.println(getDayName(day));
    }
        public static String getDayName(int day) {
            String dayName = "";
            switch (day) {
                case 1: dayName = "Monday"; break;
                case 2: dayName = "Tuesday"; break;
                case 3: dayName = "Wednesday"; break;
                case 4: dayName = "Thursday"; break;
                case 5: dayName = "Friday"; break;
                case 6: dayName = "Saturday"; break;
                case 7: dayName = "Sunday"; break;
                default:dayName = "Invalid day range";
            }
            return dayName;
        }
}

//        if(number == 1){
//            System.out.println("Monday");
//        }else if(number == 2){
//            System.out.println("Tuesday");
//        }else if(number == 3) {
//            System.out.println("Wednesday");
//        }else if(number == 4) {
//            System.out.println("Thursday");
//        }else if(number == 5) {
//            System.out.println("Friday");
//        }else if(number == 6) {
//            System.out.println("Saturday");
//        }else if( number == 7) {
//            System.out.println("Sunday");
//        }else{
//            System.out.println("Invalid day range");
