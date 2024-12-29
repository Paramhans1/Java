// Exercise - 2 (ROCK - PAPER - SCISORS)
package com.example_014;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);                        // creating Scanner Class Object (sc)
        Random r = new Random();                                    // creating Random class Object (r)

        String str = "RPS";
        System.out.println("Enter your Choice (R = Rock),(P = Paper),(S = Scisors)");
        char choice = (sc.next().toUpperCase()).charAt(0);         // taking user input and converting it to UpperCase. and assigning it first character to "choice"
        int index = r.nextInt(3);                                   // generate a random number(0 to 3 excluding 3) and assign to index
        char sys = str.charAt(index);                               // since index value is random(0 or 1 or 2) every time we have random Character of the string
        System.out.println("Computer Choice is " + sys);
        if(choice == 'R' && sys == 'R'){
            System.out.println("It a Draw");
        }
        else if(choice == 'R' && sys == 'P'){
            System.out.println("You Lose");
        }
        else if(choice == 'R' && sys == 'S'){
            System.out.println("You Win");
        }
        else if(choice == 'P' && sys == 'P'){
            System.out.println("It a Draw");
        }
        else if(choice == 'P' && sys == 'S'){
            System.out.println("You Lose");
        }
        else if(choice == 'P' && sys == 'R'){
            System.out.println("You Win");
        }
        else if(choice == 'S' && sys == 'S'){
            System.out.println("It a Draw");
        }
        else if(choice == 'S' && sys == 'R'){
            System.out.println("You Lose");
        }
        else if(choice == 'S' && sys == 'P'){
            System.out.println("You Win");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}