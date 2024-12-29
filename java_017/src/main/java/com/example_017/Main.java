// Arrays:
package com.example_017;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // There are 3 ways to create Arrays in Java:
        // 1.First declaration then memory Allocation
        int[] arr1;                                             // Array Declaration
        arr1 = new int[5];                                      // Memory Allocation
        arr1[0] = 100;                                          // Initialization
        arr1[1] = 92;                                           // Initialization
        arr1[2] = 79;                                           // Initialization
        arr1[3] = 67;                                           // Initialization
        arr1[4] = 85;                                           // Initialization


        // 2. Declaration and memory Allocation at Same Time
        int[] arr2 = new int[7];
        System.out.println("Enter an array of 7 element :");
        for(int i = 0; i < arr2.length; i++){                    // Initialization
            arr2[i] = sc.nextInt();
        }



        // 3. Declaration & Initialization:
        int[] arr3 = { 1, 2, 3, 4, 5, 6, 7 };



        // Array_name.length
        int len = arr3.length;
        System.out.println("Array length : "+ len);



        // For-Loop:
        System.out.println("Your Array is: ");
        for(int i = 0; i < len; i++){
            System.out.println(arr3[i]);
        }
        String[] str1 = {"Param", "Ramesh", "Rahul", "Vinod"};             // Array of Strings
        System.out.println("Your array in reverse order is: ");
        for(int i = (str1.length - 1); i >= 0; i--){
            System.out.println(str1[i]);
        }



        // for-each loop: it directly itterate in array element.
        System.out.println("for-each loop");
        for(int element: arr1){
            System.out.println(element);
        }



        // Multi-Dimentional Array:
        // 2-D Arrays
        int[][] arr4 = new int[2][3];
        arr4[0][0] = 101;
        arr4[0][1] = 102;
        arr4[0][2] = 103;
        arr4[1][0] = 201;
        arr4[1][1] = 202;
        arr4[1][2] = 203;
        System.out.println("Your 2-D Array is: ");
        for(int i = 0; i < arr4.length; i++){
            for(int j = 0; j < arr4[i].length; j++){
                System.out.print(arr4[i][j] + "  ");
            }
            System.out.println();
        }




        // 3-D Arrays
        int[][][] arr5 = new int[2][2][3];
        arr5[0][0][0] = 100;
        arr5[0][0][1] = 101;
        arr5[0][0][2] = 102;
        arr5[0][1][0] = 110;
        arr5[0][1][1] = 111;
        arr5[0][1][2] = 112;
        arr5[1][0][0] = 200;
        arr5[1][0][1] = 201;
        arr5[1][0][2] = 202;
        arr5[1][1][0] = 210;
        arr5[1][1][1] = 211;
        arr5[1][1][2] = 212;
        System.out.println("Your 3-D Array is: ");
        for(int i = 0; i < arr5.length; i++){
            for(int j = 0; j < arr5[i].length; j++){
                for(int k = 0; k < arr5[i][j].length; k++){
                    System.out.println(arr5[i][j][k]);
                }
            }
        }
    }
}