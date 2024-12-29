package com.example_004;
import java.util.Scanner;
// "Scanner is a class which we are importing"

public class Main {
    public static void main(String[] args) {
        System.out.println("Taking Input from User");
        Scanner sc = new Scanner(System.in);
        /*
        In above line we are creating a object(sc) for using "Scanner" Class.
        here "sc" is the Object of Scanner Class and its not a keyword. hence, it can be changed to something elese (example: "s" or "Scanner" or "a" or "obj" or ......)
        Scanner class is used to take user input.
        "Sytem.in" means take input from "keybord"
        */
        System.out.println("Enter Your Number 1: ");
        int a = sc.nextInt();
        /*
        a : is a integer variable.
        sc : is the Object of Scanner Class
        .nextInt() : is a method of Scanner class.
        */
        System.out.println("Enter Your Number 2: ");
        int b = sc.nextInt();

        float sum = a + b;
        System.out.println("The sum of these Numbers is: ");
        System.out.println(sum);

        System.out.println("Enter a Number and check its an integer or not: ");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        sc.next();                                           // Consume the integer
        sc.nextLine();                                       // Consume the empty line left by the previous input
        
        System.out.println("Enter a Sentence containing few words");
        String str1 = sc.next();
        // reads only first word of a String
        System.out.println(str1);
        
        sc.nextLine();                                       // Consume the left out string of the previous input

        System.out.println("Enter a Sentence containing few words");
        String str2 = sc.nextLine();
        // read entire line of a String
        System.out.println(str2);
        sc.close();
    }
}