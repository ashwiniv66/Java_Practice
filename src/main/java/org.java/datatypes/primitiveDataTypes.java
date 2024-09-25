package org.java.datatypes;

public class primitiveDataTypes {
//    a summary of the range and size of each primitive data type in Java:
//
//    boolean:
//    Size: Not precisely defined (often JVM-dependent)
//    Range: Can hold only two values: true and false
//
//    byte:
//    Size: 8 bits (1 byte)
//    Range: -128 to 127 (signed)

//    short:
//    Size: 16 bits (2 bytes)
//    Range: -32,768 to 32,767 (signed)

//    int:
//    Size: 32 bits (4 bytes)
//    Range: -2,147,483,648 to 2,147,483,647 (signed)

//    long:
//    Size: 64 bits (8 bytes)
//    Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (signed)

//    float:
//    Size: 32 bits (4 bytes)
//    Range: Approximately ±3.40282347E+38F (6-7 significant decimal digits)

//    double:
//    Size: 64 bits (8 bytes)
//    Range: Approximately ±1.79769313486231570E+308 (15 significant decimal digits)

//    char:
//    Size: 16 bits (2 bytes)
//    Range: 0 to 65,535 (unsigned)

//    Notes:
//    boolean: Technically doesn't have a defined size in bits because it is JVM-dependent.
//    byte, short, int, long: These are signed integers, so they can represent both positive and negative numbers within their specified ranges.
//    float and double: These are floating-point types used for representing fractional values. float is a single-precision type, while double is double-precision.
//    char: Represents a single 16-bit Unicode character.
    public static void main(String[] args){
        //  Two types of Data's
        //1. Primitive type : byte,short,int,long,float,double

        //byte - 1[-128 to -127]
        byte age = 12;
        System.out.println(age);

        //short - 2
        short short1 = 127;
        System.out.println(short1);

        //int - 4
        int number = 1232;
        System.out.println(number);

        //long - 8
        long numbers = 123L;
        System.out.println(numbers);

        //float - 4
        float pi = 3.14F;
        System.out.println(pi);

        //double - 8
        double numberss = 3.34332d;
        System.out.println(numberss);

        //char - 2
        char letter = 'a';
        System.out.println(letter);

        //boolean - 1
        boolean isAdult = false;
        System.out.println(isAdult);




    }
}
