// Array Methods:
/*
- fill() - fill the array with certain value
- toString() - returns the array as a String. including bracket
- binarySearch() - returns the first index of the specified value. array must be sorted
- copyOf() - copy the specified array with the specific length 
- push() - adds an element to the end of an array  
- pop() - removes an element from the end of an array
- shift() - removes the first element from an array
- unshift() - adds an element to the beginning of an array
- splice() - adds or removes elements from an array
- sort() - sorts the elements of an array
- reverse() - reverses the order of the elements in an array
- concat() - combines two or more arrays
- join() - combines all elements of an array into a string
- indexOf() - returns the index of the first occurrence of a specified value
- lastIndexOf() - returns the index of the last occurrence of a specified value
- includes() - returns a boolean indicating whether an array includes a specified value
- every() - returns a boolean indicating whether all elements in an array pass a test
- some() - returns a boolean indicating whether at least one element in an array passes a test
- find() - returns the first element in an array that satisfies a provided testing function
- findIndex() - returns the index of the first element in an array that satisfies a provided
- filter() - creates a new array with all elements that pass a test
- equals() - compares values of two arrays. returns true if values are same, and false if not
*/
package example_050;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Arrays.toString(array_name) ---------------------------------------------> changes the original array
        System.out.println("Arrays.toString(array_name):");
        int[] arr1 = new int[12];
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        // Arrays.fill(array_name, value) ------------------------------------------> changes the original array
        System.out.println("Arrays.fill(array_name, value):");
        Arrays.fill(arr1, 200);
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        // Arrays.fill(array_name, fromIndex, toIndex, value) ----------------------> changes the original array
        System.out.println("Arrays.fill(array_name, fromIndex, toIndex, value):");
        Arrays.fill(arr1, 0, 8, 150);
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        // Arrays.sort(array_name) --------------------------------------------------> changes the original array
        System.out.println("Arrays.sort(array_name):");
        int[] arr2 = {23, 42, 54, 32, 67, 43, 85, 9, 36};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        // Arrays.copyOf(array_name, toIndex) --------------------------------------> returns a new array
        System.out.println("Arrays.copyOf(array_name, length):");
        int[] arr3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr4 = Arrays.copyOf(arr3, 5);
        System.out.println(Arrays.toString(arr4));
        System.out.println();

        // Arrays.copyOf(array_name, fromIndex, toIndex) ----------------------------> returns a new array
        System.out.println("Arrays.copyOf(array_name, fromIndex, toIndex):");
        int[] arr5 = Arrays.copyOfRange(arr3, 2, 6);
        System.out.println(Arrays.toString(arr5));
        System.out.println();

        // Arrays.equals(array_name1, array_name2) -----------------------------------> returns true or false
        System.out.println("Arrays.equals(array_name1, array_name2):");
        System.out.println(Arrays.equals(arr4, arr5));
        System.out.println();

        // Arrays.binarySearch(array_name, key) --------------------------------------> returns the index of the key . array must be sorted before binary search
        System.out.println("Arrays.binarySearch(array_name, key):");
        int[] arr6 = {12, 67, 83, 29, 72, 10, 93, 23};
        Arrays.sort(arr6);
        System.out.println(Arrays.binarySearch(arr6, 72));
    }
}