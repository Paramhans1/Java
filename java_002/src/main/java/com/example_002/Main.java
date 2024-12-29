/*
                                        Data Types in Java:
                                        /                  \
                                       /                    \
                                      /                      \
                                     /                        \
                                    /                          \
                                   /                            \
                                  /                              \
                                 /                                \
                                /                                  \
                               /                                    \
                              /                                      \
                             /                                        \
                            /                                          \
                           |                                            |
        1. Primitive Data Types(if ls bb cd)                 2. Non-Primitive Data Types                                  
(int, float, long, short, bool, byte, char, double)          (derived from peimitive Data type)
*/
package com.example_002;

public class Main {
    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 7;
        int n3 = 8;
        int sum = n1 + n2 + n3;
        System.out.println(sum);
    }
}

/*
Primitive Data Types:
1. byte ------------> 1-byte = 8-bit signed integer.
                      ranges = -(2**8)/2 to (2**8)/2 - 1
2. short -----------> 2-byte = 16-bit signed integer.
                      ranges = -(2**16)/2 to (2**16)/2 - 1
3. int -------------> 4-byte = 32-bit signed integer.
                      ranges = -(2**32)/2 to (2**32)/2 - 1
4. long ------------> 8-byte = 64-bit signed integer.
                      ranges = -(2**64)/2 to (2**64)/2 - 1
5. float -----------> 4-byte = 32-bit floating point number.
6. double ----------> 8-byte = 64-bit floating point number.
7. boolean ---------> 1-byte = true or false.
8. char ------------> 2-byte = single character.                  
 */