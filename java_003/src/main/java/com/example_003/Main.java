// Literals in Java :
package com.example_003;

public class Main {
    public static void main(String[] args) {
        byte age = 34;                   // byte literal
        int age1 = 56;                   // integer literal
        short age2 = 78;                 // short literal
        long age3 = 1234567890L;         // long literal(l,L)

        char ch = 'A';                   // character literal

        float f1 = 5.6f;                 // float literal(f,F)

        double d1 = 4.66;                // double literal. by default java consider every decimal number as double. so, specifically no need to mention "D , d" at ending
        boolean b = true;                // boolean literal
        String str = "Harry";            // String literal . "S" is capital in "String"
        // age, ch, f1, d1 b, str are variables
        // 34, 'A', 5.6f, 4.66, true, Harry are literals
        System.out.println(age);
        System.out.println(age1);
        System.out.println(age2);
        System.out.println(age3);
        System.out.println(ch);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(b);
        System.out.println(str);
    }
}