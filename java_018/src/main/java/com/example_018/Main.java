// Practice Set - 6
package com.example_018;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        // Question no.1
        float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f, 95.0f};
        float sum = 0;
        for (float a : marks) {                 // it only iterate  on elements of an array
            sum += a;
        }
        System.out.println("Sum of marks: " + sum);





        // Question no.2
        int[] num = {1, 2, 3, 4, 5, 15, 16, 17, 18, 19};
        System.out.println("Enter your number");
        int n = sc.nextInt();
        boolean found = false;
        for (int i : num) {
            if(i == n){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Number found");
        }else{
            System.out.println("Number not found");
        }





        // Question no.3
        float sum_marks = 0;
        for(float i : marks){
            sum_marks = sum_marks + i;
        }
        float average = sum_marks/marks.length;
        System.out.println("Average of marks of Student is: "+ average);






        // Question no.4
        int[][] mat1 = new int[2][3];
        int[][] mat2 = new int[2][3];
        int[][] sum_mat = new int[2][3];
        System.out.println("Enter first matrix: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second matrix: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                mat2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                sum_mat[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(sum_mat[i][j] + "  ");
            }
            System.out.println();
        }



                        //or
        /*
        int[][] mat1 = {{1, 2, 3},
                        {4, 5, 6}};
        int[][] mat2 = {{7, 8, 9},
                        {10, 11, 12}};
        int[][] sum_mat = {{0, 0, 0},
                            {0, 0, 0}};
        for(int i = 0; i < mat1.length; i++){
            for(int j = 0; j < mat1[i].length; j++){
                sum_mat[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(sum_mat[i][j] + "  ");
            }
            System.out.println();
        }       
        */




        // Question no.5
        int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int len = arr1.length;
        int mid = Math.floorDiv(len, 2);                        // len/2 and if decimal then assign its floor value to "mid"
        System.out.println("Reversed array is: ");
        for(int i = 0; i < mid; i++){
            int temp;
            temp = arr1[i];
            arr1[i] = arr1[len - (i+1)];
            arr1[len - (i+1)] = temp;
        }
        for(int i: arr1){
            System.out.print(i + " ");
        }
        System.out.println();






        // Question no.6
        System.out.println("Maximum element of array is: ");
        int [] arr2 = {19, 81, 17, 63, 15, 99, 51};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr2.length; i++){
            if(arr2[i] > max){
                max = arr2[i];
            }
        }
        System.out.println(max);





        // Question no.7
        System.out.println("Minimum element of array is: ");
        int [] arr3 = {10, 11, 12, 13, 19, 29, 25, 5};
        int min = Integer.MAX_VALUE;
        for(int i: arr3){
            if(i < min){
                min = i;
            }
        }
        System.out.println(min);






        // Note:
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);







        // Question no.8 : 
        // Not sortrd
        int[] arr4 = {1, 210, 3, 65, 88, 99, 34};
        boolean b1 = true;
        for(int i = 0; i < arr4.length - 1; i++){
            if(arr4[i] > arr4[i+1]){
                b1 = false;
                break;
            }
        }
        if(b1){
            System.out.println("Array arr4 is sorted");
        }
        else{
            System.out.println("Array arr4 is not sorted");
        }


        // Sorted
        int[] arr5 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean b2 = true;
        for(int i = 0; i < arr5.length - 1; i++){
            if(arr5[i] > arr5[i+1]){
                b2 = false;
                break;
            }
        }
        if(b2){
            System.out.println("Array arr5 is sorted");
        }
        else{
            System.out.println("Array arr5 is not sorted");
        }
    }
}