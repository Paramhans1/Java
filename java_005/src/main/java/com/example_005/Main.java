// Exercise - 1 (Percentage Calculator)
package com.example_005;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Subjects");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Enter Total marks of a subject");
        int total = sc.nextInt();
        System.out.println("Enter marks of each subject");
        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            sum = sum + x;
        }
        System.out.println("Total Marks = " +sum);
        System.out.println("Student Percentage = " +((double)sum*100)/(n*total) + "%");
    }
}