package exception_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 90;
        marks[1] = 80;
        marks[2] = 70;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index");
        int idx = sc.nextInt();

        System.out.println("Enter the number you want to divide");
        int num = sc.nextInt();
        try {
            System.out.println("The mark at index " + idx + " is " + marks[idx]);
            System.out.println("The array-value/number is " + marks[idx]/num);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        catch(Exception e){
            System.out.println("Some other exception");
        }
    }
}