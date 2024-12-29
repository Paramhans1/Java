// Practice Set - 3
package com.example_011;

public class Main {
    public static void main(String[] args) {

        // Question no.1
        String str1 = "Hi Jack. How Are You";
        System.out.println(str1.toLowerCase());



        // Question no.2
        String str2 = str1.replace(' ', '_');
        System.out.println(str2);



        // Question no.3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Param");                      // strings are immutable. here we are updating the variable with new string string
        System.out.println(letter);



        // Question no.4
        String str3 = "This  string contain   double and triple spaces";
        System.out.println("double space is at index : " + str3.indexOf("  "));
        System.out.println("triple space is at index : " + str3.indexOf("   "));



        // Question no.5
        String str4 =  "Dear Param.\n\t This Java course is awesome. \n\t\t\tThanks!";
        System.out.println(str4);
    }
}