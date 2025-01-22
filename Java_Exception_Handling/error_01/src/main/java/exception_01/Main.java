// Errors & Exception in java: Exception is an event that disrupts the normal flow of the program. it is an object which is thrown at runtime.
/* 
ERRORS: there are 3 types of errors
1. Syntax errors: These are errors that occur when the compiler encounters a syntax error in the code
                  example: int a = 9 ---------------------> semicolon ; is missing
2. Logical errors: These are errors that occur when the program does not produce the expected output
                   example: int a = 9; int b = 9; if(a == b)
                            "BUGS"
3. Runtime errors: These are errors that occur during the execution of the program
                   example: int a = 9 / 0 ---------------------> division by zero
                            unable to pull or fetch data


Commonly occuring Exceptions:
1. ArithmeticException: when there is an error in the arithmetic operation
2. NullPointerException: when you try to use a null object reference . example: String s = null; int len = s.length();
3. ArrayIndexOutOfBoundsException: when you try to access an array with an index which doesnt exist
4. IllegalArgumentException: When u have to pass "string" but u have passed an "Object"
5. NumberFormatException: when u want to convert "string" to "int" but conversion in not possible due to improper string
*/
package exception_01;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // RunTime Error: Program will Crash while Run Time error . and program terminate there itself
        int[] numerator = {10, 200, 30, 40};
        int[] denominator = {2, 5, 0, 10};
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(divide(numerator[i],denominator[i]));
            }
            // We can use "or" when multiple exception
            catch (ArrayIndexOutOfBoundsException | NullPointerException e){
                System.out.println(e);
            }
        }
        System.out.println("Have a great day");

    }

    public static int divide(int a, int b){
        // Exception is an event that disrupts the normal flow of the program. it is an object which is thrown at runtime.
        // it is an object thrown at run time by JVM at run time
        // multiple" catch " 
        try{
            return a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception:");
            return -1;
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception:");
            return -1;
        }
        catch(Exception e ){
            System.out.println(e);
            return -1;
        }
    }
}