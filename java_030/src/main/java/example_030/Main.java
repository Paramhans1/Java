// Exercise - 3 Guess the correct number
package example_030;
import java.util.Scanner;
import java.util.Random;

// Creating another Class "GuessTheNumber{}" class
class GuessTheNumber{
    private int system;
    // Constructor
    public GuessTheNumber(int num){
        system = num;
        System.out.println("Random number: "+ num);
    }
    // Getter method since "system is private"
    public int getSystem(){
        return system;
    }

    // method to take input from user
    void takeUserInput(){
        @SuppressWarnings("resource")
        // creating Object for Scanner Class 
        Scanner sc = new Scanner(System.in);
        int count = 0;
        Boolean found = false;
        while(!found){
            System.out.println("Guess the number between 1 to 100");
            // Reading user input
            int mynum = sc.nextInt();
            // calling "isCorrectNumber()" and passing "system" and "mynum" as argument 
            found = isCorrectNumber(getSystem(), mynum);
            if(found){
                System.out.println("And your score is "+ (100-count) );
            }
            count++;

        }
        
    }


    boolean isCorrectNumber(int system, int mynum){
        if(system == mynum){
            System.out.println("Your Guess is correct");
            return true;
        }
        else{
            if(system > mynum){
                System.out.println("Your Guess is too low.");
            }
            else if(system < mynum){
                System.out.println("Your Guess is too high.");
            }
            return false;
        }

    }
}

public class Main {
    public static void main(String[] args) {
        // creating a object for "Random Class"
        Random r = new Random();
        // creating a object "guess" for "GuessTheNumber" Class using constructor and pass "generated Random number".
        GuessTheNumber guess = new GuessTheNumber(r.nextInt(100));
        // calling a method to take input of guess from user
        guess.takeUserInput();


    }
}