// Loops:
package com.example_015;

public class Main {
    public static void main(String[] args) {


        // while loop:
        System.out.println("while loop");
        int x = 0;
        while (x <= 4) {
            System.out.println(x);
            x++;
        }



        // do-while loop: it execute atleast once. even if condition fails. because first it execute the code then checks the condition.
        System.out.println("do-while loop");
        int y = 4;
        do{
            System.out.println(y);
            y--;
        }
        while(y >= 0);



        // For-Loop:
        System.out.println("For-Loop");
        int sum = 0;
        for(int i = 0; i <= 4; i++) {
            sum +=1;
            System.out.println(i + " + " );
        }
        System.out.println("sum = "+ sum);
        



        // Break: weather the condition is "true" or "false" whenever "break" is encountered inside the loop, the control is sent outside the loop.
        System.out.println("Break");
        for(int i = 0; i <= 7; i++ ){
            if(i == 4){
                System.out.println("Ending the loop");
                break;
            }
            System.out.println("Java is a good language");
        }




        // Continue: skip left out code and go for next iteration
        System.out.println("Continue");
        for(int i = 0; i <= 7; i++ ){
            if(i == 4){
                System.out.println("skipping this iteration");
                continue;
            }
            System.out.println(i);
        }
    }
}