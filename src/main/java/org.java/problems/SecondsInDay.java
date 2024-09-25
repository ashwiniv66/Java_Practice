package org.example.problems;

public class SecondsInDay {
    public static void main(String[] args) {
        // Declaring Constants
        int secondsperminute = 60;
        int minuteperhour = 60;
        int hoursperday = 24;

        // Calculate total seconds in a day
        int secondsInDay = secondsperminute * minuteperhour * hoursperday;

        // Output the result
        System.out.println("Seconds in a day " + secondsInDay );

    }
}
