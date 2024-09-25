package org.example.loops.problems;

import java.util.Scanner;

//8. Write a Java program that requires the user to
// enter a single character from the alphabet.
// Print Vowel or Consonant, depending on user input.
// If the user input is not a letter (between a and z or A and Z),
// or is a string of length > 1, print an error message.
//Test Data
//Input an alphabet: p
//Expected Output :
//Input letter is Consonant
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a alphabet : ");
        String str = input.next().toLowerCase();

        boolean uppercase = str.charAt(0) >= 65 && str.charAt(0) <= 90;
        boolean lowercase = str.charAt(0) >= 97 && str.charAt(0) <= 122;
        boolean vowels = str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u");

        if(str.length() > 1 ){
            System.out.println("Invalid character");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Error : Enter a lowercase or uppercase alphabet");
        } else if (vowels) {
            System.out.println("Input letter is Vowel");
        }else{
            System.out.println("Input letter is Consonant");
        }
    }
}
