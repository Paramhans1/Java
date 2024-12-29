package com.example_007;

public class Main {
  public static void main(String[] args) {
    System.out.println("Operators and Expressions:");
    /*
    Operators and Expressions:
    - Arithmetic operators: +, -, *, /, %
    - Comparison operators: ==, !=, <, >, <=, >=
    - Logical operators: &&, ||, !
    - Assignment operators: =, +=, -=, *=, /=, %=, <<=, >>=, &=, ^=, |=
    - Bitwise operators: &, |, ^, ~, <<, >>
    - Ternary operator: contional_statement ? exp1 : exp2
    - Pre-Increment and Pre-decrement operators: ++a, --a
    - Post-Increment and Post-decrement operators: a++, a--
    */    
    int a = 10;
    char ch = 'a';
    System.out.println(++a);
    System.out.println(++ch);

    System.out.println("Precedence and Associativity");
    /*
    Precendence and Associativity:
    Precedence : operator having highest precedence will be evaluated first
    Associativity : operator having same precedence will be evaluated from left to right or right to left depending on associativity.
    example, int a = 6 * 5 - 34 / 2;
                 = 30 - 34 / 2
                 = 30 - 17
                 = 13
    int b = 60 / 5 - 34 * 2;
                 = 12 - 34 * 2
                 = 12 - 68
                 = -56
    example,     * , / -----------> Left to Right
                 + , - -----------> Left to Right
                 ++ , = -----------> Right to Left (a = b = 45)
    */
    System.out.println("DataType of Expression after Evaluation");
    /*
    DataType of Expression after Evaluation:

    hierarchy of Data Type evaluation:
    --------->  int ---------->  float --------->  Double

    byte    +     short   -------->   int
    short   +     int     -------->   int
    long    +     float   -------->   float
    int     +     float   -------->   float
    char    +     int     -------->   int
    char    +     short   -------->   int
    long    +     double  -------->   double
    float   +     double  -------->   double
    */
      }
    }              