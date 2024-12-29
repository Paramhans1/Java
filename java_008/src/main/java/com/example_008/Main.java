// Practice Set - 2
package com.example_008;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        // Question no.1
        float z = 7/4 * 9/2;
        /*
         precedence of *, / are equal
         hence use Associativity. ie, left to right
         7/4 = 1        (int/int = int)
         1*9 = 9        (int*int = int)
         9/2 = 4        (int/int = int)
        */
        System.out.println(z);

        float b = 7/4.0f * 9/2.0f;
        /*
         7/4.0     = 1.75         (int/float = float)
         1.75*9    = 15.75        (float*int = float)
         15.75/2.0 = 7.875        (float/float = float)
        */
        System.out.println(b);




        // Question no.2
        System.out.println("Enter your grade: ");
        String input = sc.next();
        char x = input.charAt(0);
        
        // Encrypt
        System.out.println("Encryption");
        char grade = (char)(x + 8);
        System.out.println(grade);

        // Decrypt
        System.out.println("Decryption");
        System.out.println((char)(grade - 8));

     
        


        // Question no.3
        System.out.println("Enter a Number: ");
        float n = sc.nextFloat();
        System.out.println(n>8);                         // if n > 8 returns true



        // Question no.4
        int v=1, u=2, a=3, s=4;
        float ans = ((v*v) - (u*u))/(2*a*s);
        System.out.println(ans);



        // Question no. 5
        int res = 7*49/7 + 35/7;
        /*
        7*49/7 = 49
        35/7   = 5
        49 + 5 = 54 
        */
        System.out.println(res);
    }
}