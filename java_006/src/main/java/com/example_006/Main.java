// Practice Set - 1
package com.example_006;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Question no.1
        int a = 10;
        int b = 20;
        int c = 30;
        int sum = a + b + c;
        System.out.println(sum);


        // Question no.2
        float sub1 = 45;
        float sub2 = 90;
        float sub3 = 85;
        float cgpa = (sub1 + sub2 + sub3)/(3*10);
        System.out.println(cgpa);


        // Question no.3
        @SuppressWarnings("resource")                                // this is just to supress warning of "sc object"
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "." + " Have a nice day!");


        // Question no.4
        System.out.println("Enter the distance in Kilometers: ");
        double k = sc.nextDouble();
        double m = k * 1.6;
        System.out.println(k + "km = " + m + "miles.");


        // Question no.5
        System.out.println("Enter your number: ");
        System.out.println(sc.hasNextInt());
        sc.next();                                           // Consume the integer
        sc.nextLine();                                       // Consume the empty line left by the previous input
    }
}