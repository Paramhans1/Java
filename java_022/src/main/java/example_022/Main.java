// Variable Arguments (Varargs)
package example_022;

public class Main {
    // Varargs: this will accept every argument or parameter that is being passed as an "array"
    static int sum(int ...arr){
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    // In this Varargs alteast one argument is required  to pass
    static int bar(int x, int ...arr){
        int result = x;
        for (int i : arr) {
            result += i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("The sum of nothing is: " + sum());
        System.out.println("The sum of 3 and 4 is: " + sum(3, 4));
        System.out.println("The sum of 3, 4 and 5 is: " + sum(3, 4, 5));
        System.out.println("The sum of 3, 4, 5 and 6 is: " + sum(3, 4, 5, 6));

        // System.out.println("The sum of nothing is: " + bar());
        System.out.println("The sum of 1 is: " + bar(1));
        System.out.println("The sum of 3 and 4 is: " + bar(3, 4));
        System.out.println("The sum of 3, 4 and 5 is: " + bar(3, 4, 5));
        System.out.println("The sum of 3, 4, 5 and 6 is: " + bar(3, 4, 5, 6));
    }

}