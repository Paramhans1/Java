// Method Overloading: Same method name with different number of parameter
//                     Method Overloading can not be performed by changing return type of method

package com.example_021;
public class Main{

    static void foo(){
        System.out.println("Hello sir");
    }


    static void foo(String a){
        System.out.println("Hello "+ a);
    }

    static void foo(String a, String b){
        System.out.println("Hello Mr."+ a);
        System.out.println("Hello Mr."+ b);
    }

    // Method Overloading can not be achieved by changing return type of method
    // static int foo(String a, String b){
    //     System.out.println("Hello Mr."+ a);
    //     System.out.println("Hello Mr."+ b);
    //     return 1;
    // }

    public static void main(String[] args){
        // Same method name with different number of parameter
        foo();
        foo("Rakesh");
        foo("Rakesh", "Kumar");
        // Arguments are actual value

    }
}