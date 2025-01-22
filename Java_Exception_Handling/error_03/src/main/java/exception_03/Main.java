package exception_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 90;
        marks[1] = 80;
        marks[2] = 70;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();
        try {
            System.out.println("Hi this is param");
            try{
                System.out.println(marks[idx]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.println("hello");
            }
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("god");
        }
    }
}