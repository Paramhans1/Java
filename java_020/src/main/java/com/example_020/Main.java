// Method Overloading:
package com.example_020;

public class Main {

    // we use 'void' when we dot want method to return anything
    static void telJoke(){
        System.out.println("Good Morning Bharat");
        System.out.println("I invented a new word! \nPlagirism");
    }
    // Passing without refference
    static void change(int a){
        a = 98;
    }
    // Passing by reference 
    static void change2(int[] arr){
        arr[0] = 98;
    }



    public static void main(String[] args) {
        telJoke();

        // Case 1: since we are just passing copy of oringinal value to method . changes in copied value doesnt impact the original value
        int x = 45;
        change(x);
        System.out.println("Value of x after running change() is " + x);

        // Case 2: here we are calling method and passing reference value. changes in reference value also reftect in original value
        int[] marks = {45, 65, 89, 63, 87, 23};
        change2(marks);
        System.out.println("Value of marks after running change2() is " + marks[0]);


        }
}
/*
Note:
when we use word "static" for method(). this makes that particular method() associate( or link with) with Class
since this method is already linked to our class . there is no need to create seperate object for accessing the method()
we can directly call the method 



In case of array , the reference is passes. Same is The Case for Object Passing to method.
*/