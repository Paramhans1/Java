// Practice Set - 4:
package com.example_013;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);

        // Question no.1
        /*
        int a = 10;
        if(a = 11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }
        */


        // Question no.2
        System.out.println("Enter marks of 3 Subject (out of 100):");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt(); 
        float per = ((m1 + m2 + m3)*100)/(100*3.0f);
        System.out.println("Percentage: "+per+"%");
        if(per>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulation, You have been promoted");
        }
        else{
            System.out.println("Sorry, You have been failed");
        }

     
        // Question no.3
        /*
        Income Slab                    Tax
        0 - 2.5 Lakh                    0%  (ie,0.00)
        2.5 - 5 Lakh                    5%  (ie,0.05)
        5 - 10 Lakh                     20% (ie,0.20)
        Above 10 Lakh                   30% (ie,0.30)
        */
        System.out.println("Enter your income amount:");
        int income = sc.nextInt();
        float tax = 0;
        if(income<=250000){
            tax = tax + 0;
            System.out.println("Tax is 0% = " + tax);
        }
        else if(income>250000 && income<=500000){
            tax = tax + 0;
            tax = tax + (0.05f * (income - 250000));
        }
        else if(income>500000 && income<=1000000){
            tax = tax + 0;
            tax = tax + (0.05f * (500000 - 250000));
            tax = tax + (0.20f * (income - 500000));
        }
        else{
            tax = tax + 0;
            tax = tax + (0.05f * (500000 - 250000));
            tax = tax + (0.20f * (1000000 - 500000));
            tax = tax + (0.30f * (income - 1000000));
        }
        System.out.println("Total tax paid by employee is: " + tax);


        // Question no.4
        System.out.println("Enter your favorite week day:");
        int day = sc.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }


        // Question no.5
        /*
        A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
        A leap year (except a century year) can be identified if it is exactly divisible by 4.
        A century year should be divisible by 4 and 100 both.
        A non-century year should be divisible only by 4.
 
        */
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        sc.nextLine();
        if((year % 4) == 0){
            if((year % 100) == 0){
                if((year % 400) == 0){
                    System.out.println(year + " is a leap year");
                }
                else{
                    System.out.println(year + " is not a leap year");
                }
            }
            else{
                System.out.println(year + " is a leap year");
            }
        }
        else{
            System.out.println(year + " is not a leap year");
        }



        // Question no.6
        System.out.println("Enter your URL: ");
        String url = sc.nextLine();
        if(url.endsWith(".com")){
            System.out.println("This is a commercial website");
        }
        else if(url.endsWith(".org")){
            System.out.println("This is an organization website");
        }
        else if(url.endsWith(".edu")){
            System.out.println("This is an educational website");
        }
        else if(url.endsWith(".in")){
            System.out.println("This is Indian website");
        }
        else{
            System.out.println("This is not a valid URL");
        }

    }
}