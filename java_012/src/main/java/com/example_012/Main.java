// Conditional Statement:
package com.example_012;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // if-else:
        System.out.println("if-else-if-else:");
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if (age <= 0){
            System.out.println("Invalid age");
        }
        else if (age < 18){
            System.out.println("You are a minor");
        }
        else{
            System.out.println("You are eligible to drive.");
        } 



        
        
        // switch case:
        System.out.println("switch case:");
        switch(age){
            case 12:
                System.out.println("Your age is 12 years");
                break;
            case 14:
                System.out.println("Your age is 14 years");
                break;
            case 16:
                System.out.println("Your age is 16 years");
                break;
            case 18:
                System.out.println("Your age is 18 years");
                break;
            default:
                System.out.println("Your age is not special");
        }

        System.out.println("Enter your grade in UpperCase");
        String input = sc.next();
        char grade = input.charAt(0);
        // char grade = sc.next().charAt(0);
        switch(grade){
            case 'A':
                System.out.println("You are in A grade");
                break;
            case 'B':
                System.out.println("You are in B grade");
                break;
            case 'C':
                System.out.println("You are in C grade");
                break;
            case 'D':
                System.out.println("You are in D grade");
                break;
            case 'E':
                System.out.println("You are in E grade");
                break;
            default:
                System.out.println("Yoe are Failed");
        }


        // Enhanced switch case: here we no need to write break statement.
        System.out.println("Enhanced switch case:");
        switch(grade){
            case 'A' -> System.out.println("You are in A grade");
            case 'B' -> System.out.println("You are in B grade");
            case 'C' -> System.out.println("You are in C grade");
            case 'D' -> System.out.println("You are in D grade");
            case 'E' -> System.out.println("You are in E grade");
            default -> {
                System.out.println("You are Failed");
                System.out.println("if you have multi-line. then write inside {}");
            }
        }
        
    }
}