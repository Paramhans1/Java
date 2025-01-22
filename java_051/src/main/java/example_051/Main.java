/* 
Math Methods:
- Absolute Value: returns only positive value. if negative changes into positive
- Min: return minimum of two numbers
- Max: return maximum of two numbers
- Power: returns first argument raised to power of second argument
- Square Root: returns the square root of a number
- Round: returns the nearest integer of a number
- Floor: returns the largest integer less than or equal to a number
- Ceil: returns the smallest integer greater than or equal to a number
- Random: return a positive double value. greater than or equal to 0.0 and less than 1.0

*/ 
package example_051;

public class Main {
    public static void main(String[] args) {
        // Math.random()
        System.out.println("Math.random()");
        double a = Math.random();
        System.out.println("Random Number: " + a);
        System.out.println();

        //-Math.random()
        System.out.println("-Math.random()");
        double b = -Math.random();
        System.out.println("Random Number: " + b);
        System.out.println();

        // Math.min(num1, num2)
        System.out.println("Math.min(num1, num2)");
        System.out.println(Math.min(2, 4));
        System.out.println(Math.min(8, 4));
        System.out.println();

        // Math.max(num1, num2)
        System.out.println("Math.max(num1, num2)");
        System.out.println(Math.max(2, 4));
        System.out.println(Math.max(8, 4));
        System.out.println();

        // Math.round(num)
        System.out.println("Math.round(num)");
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.5));
        System.out.println();

        // Math.floor(num)
        System.out.println("Math.floor(num)");
        System.out.println(Math.floor(3.14));
        System.out.println(Math.floor(3.99));
        System.out.println();

        // Math.ceil(num)
        System.out.println("Math.ceil(num)");
        System.out.println(Math.ceil(3.14));
        System.out.println(Math.ceil(3.99));
        System.out.println();

        // Math.pow(base, exponent)
        System.out.println("Math.pow(base, exponent)");
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(3, 4));
        System.out.println();

        // Math.sqrt(num)
        System.out.println("Math.sqrt(num)");
        System.out.println(Math.sqrt(16));
        System.out.println(Math.sqrt(25));
        System.out.println();

        // Math.abs(num)
        System.out.println("Math.abs(num)");
        System.out.println(Math.abs(-5));
        System.out.println(Math.abs(5));
        System.out.println();

        // Question 1: random number between 0 to 100. [0, 100] are included
        System.out.println("Random number between 0 to 100");
        System.out.println(Math.round(Math.random() * 100));
    }
}