package org.java.operators.airthmetic;

public class ModulusOperator {
//    5. Modulus(%): This is a binary operator that is used to return the remainder when the first operand(dividend) is divided by the second operand(divisor).
//
//    Syntax:
//    num1 % num2

//    Example:
//    num1 = 5, num2 = 2
//    mod = num1 % num2 = 1
public static void main(String[] args)
{
    // initializing variables
    int num1 = 5, num2 = 2, mod = 0;

    // Displaying num1 and num2
    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);

    // Remaindering num1 and num2
    mod = num1 % num2;
    System.out.println("Remainder = " + mod);
}
}
