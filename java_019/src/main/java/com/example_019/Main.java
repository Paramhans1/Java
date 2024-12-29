/*
Method Call are of two type:
1. Static Method Call
Static Method is a method which is called without creating an object of the class

2. Non-Static Method Call
Non Static Method is a method which is called by creating an object of the class
*/
package com.example_019;
import java.util.Scanner;

public class Main {
    // Method call without using object:
    // "static" : whenever you are calling a method or function without object then, need to declare that method or function with "static"
    static int logic(int x, int y){
        if (x > y){
            return x + y;
        }
        else{
            return (x + y) * 5;
        }
    }



    // Method call using object
    int sum_diff(int a, int b){
        if(a<b){
            return a-b;
        }
        else{
            return a+b;
        }
    }


    // Java program execution Stats from Main method:
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);                        // Creating Scanner object(sc)
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = logic(a, b);;                                       // Method call without using object and passing 'a'and 'b' as parameter
        System.out.println("The value of c = "+ c);
        Main m = new Main();                                        // Creating an object of class "Main" namely "m"
        int d = m.sum_diff(a, b);                                   // Method call using object and passing 'a'and 'b' as parameter
        System.out.println("The value of d = "+ d);

        }
}