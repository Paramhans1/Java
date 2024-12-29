// Recursion: A function calling itself is called "Recursion"
package example_023;

public class Main {

    // factorial(n) = n * (n-1) * (n-2) *........1
    // factorial(n) = n * factorial(n-1)
    // factorial(0) = 1;
    // Recursion:
    static int factorial(int n){
        // base condition
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    // Iterative:
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for(int i = 2; i <= n; i++){
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println(factorial(x));
        System.out.println(factorial_iterative(x));
    }
}