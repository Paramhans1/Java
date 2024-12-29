// Practice Set - 5
package com.example_016;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

/*
        Question no.1
        print following pattern
        *  *  *  *
        *  *  *
        *  *
        *
*/
        System.out.println("Enter \"n\" value: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = (n - i); j > 0; j--){
                System.out.print("*  ");
            }
            System.out.println();
        }

                  // or
        
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*  ");
            }
        System.out.println();
        }



        // Question no.2
        System.out.println("Enter your number: ");
        int n1 = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n1; i++){
            sum = sum + (2*i);
        }
        System.out.println("Sum of first " + n1 + " even natural numbers is: " + sum);



        // Question no.3
        System.out.println("Enter your number: ");
        int n2 = sc.nextInt();
        System.out.println("Multiplication Table of "+ n2 + " : ");
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d  X  %d  =  %d\n", n2, i, n2*i);
        }




        // Question no.4
        System.out.println("Enter your number: ");
        int n3 = sc.nextInt();
        System.out.println("Reverse Multiplication Table of "+ n3 + " : ");
        for(int i = 10; i >= 1; i--){
            System.out.printf("%d  X  %d  =  %d\n", n3, i, n3*i);
        }



        // Question no.5 : factorial of 5 = 5*4*3*2*1
        System.out.println("Enter your number: ");
        int n4 = sc.nextInt();
        int fact1 = 1;
        for(int i = n4; i >=1 ; i--){
            fact1 = fact1 * i;
        }
        System.out.println("factorial of " + n4 + " is: " + fact1);





        // Question no.6 : factorial of 5 = 5*4*3*2*1
        System.out.println("Enter your number: ");
        int n5 = sc.nextInt();
        int i = n5;
        int fact2 = 1;
        while(i >= 1){
            fact2 = fact2 * i;
            i--; 
        }
        System.out.println("factorial of " + n4 + " is: " + fact2);




/*
        Question no.7
        print following pattern
        *  *  *  *
        *  *  *
        *  *
        *
*/
        System.out.println("Enter your number: ");
        int n6 = sc.nextInt();
        for(int k = n6; k >= 1; k--){
            for(int j = 0; j < k; j++){
                System.out.print("* ");
            }
            System.out.println();
        }




        // Question no.8
        // what can be done using one type of loop can also ne done by using another types of loop




        // Question no.9
        System.out.println("Enter a number: ");
        int n7 = sc.nextInt();
        int Sum_Of_Mul = 0;
        for(int j = 1; j <= 10; j++){
            Sum_Of_Mul = Sum_Of_Mul + (n7 * j);
        }
        System.out.println("Sum of multiplication of " + n7 + " is: " + Sum_Of_Mul);





        // Question no.10
        // do-wile is executed atleast one time





        // Question no.11
        System.out.println("Enter a natural Number: ");
        int n8 = sc.nextInt();
        int j = 0;
        int Even_Sum = 0;
        while(j < n8){
            Even_Sum = Even_Sum + (2*j);
            j++;
        }
        System.out.printf("Sum of first %d even numbers is: %d\n", n8, Even_Sum);
    }
}