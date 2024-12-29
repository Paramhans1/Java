/*
Strings in Java: String is immutable and can not be changed.
Syntax :        String name = new String("my_string")
                here "name" is an "object" and "String" represent String class

String in java is a Class . it not a Primitive DataType . But java provide special support "String" so, we can use it like a Primitive DataType 
example:
               String name = "my_string"           // this is called String Literal
*/
package com.example_009;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        String str1 = new String("I am Param");
        System.out.println(str1);

        String str2 = "I work at Google" ;
        System.out.println(str2);

        int a = 6;
        float b = 5.64547f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);                              
        // %8.2f means it can have atmost 2 decimal digits(ie, %0.2f) and it will occupy only 8 places in total. if number of digits are less than 8. then rest places will occupied as space
        System.out.println();
        System.out.format("The value of a is %d and value of b is %f", a, b);
        System.out.println();
        /*
        similarly,
        %b ------> boolean
        %d ------> int
        %f ------> float
        %s ------> String
        %c ------> char
        */

        System.out.println("Enter a String");
        // String str3 = sc.next();
        String str3 = sc.nextLine();
        System.out.println(str3);
    }
}