/*
Streams: its a feature introduced in java 8. used to process collections of data in a functional and declarative manner
enhance functionality
improve readability and maintainability
without dealing with concept of multi-threading we can achieve parallelism using "streams"

how to use streams?
source ----------> intermediate operation -----------------> terminal operation
*/
package functional_04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);                // here num(ie, list) is a source
        // print count of even numbers in list . without using streams
        int c = 0;
        for (Integer i : num) {
            if (i % 2 == 0) {
                c++;
            }
        }
        System.out.println("count of even numbers in list is " + c);
        // print count of even numbers in list . using streams
        // num.streams -------------------------------------------------------------> converting "list" into "stream()"
        // .filter(i -> i % 2 == 0) ------------------------------------------------> filtering even numbers (this is intermediate operation)
        // .count() -----------------------------------------------------------------> counting even numbers (this is terminal operation)
        long count = num.stream().filter(i -> i % 2 == 0).count();
        System.out.println("count of even numbers in list is " + count);





        // creating streams(ie, list.stream())
        // 1. from collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);  
        Stream<Integer> st1 = list.stream();


        // 2. from arrays(ie, Arrays.stream(arr))
        Integer[] arr = {1, 2, 3, 4, 5};
        Stream<Integer> st2 = Arrays.stream(arr);


        // 3. using Stream.of() 
        Stream<Integer> st3 = Stream.of(1, 2, 3, 4);


        // 4. Infinite streams(ie, Stream.generate())
        Stream<Integer> st4 = Stream.generate(() -> 1).limit(100);                                               // this will create a infinite stream with value "1" . we limited its size to 100

        // 5. Infinite streams(ie, Stream.iterate(starting point value, unaryOperator format)
        List<Integer> st5 = Stream.iterate(1, i -> i + 1).limit(100).collect(Collectors.toList());
        // Stream.iterate(starting value, unaryOperation) --------------------------------------------------------> create infinite loop 
        // limit(100) --------------------------------------------------------------------------------------------> limit the size of stream to 100
        // collect(Collectors.toList()) --------------------------------------------------------------------------> convert stream into list
        System.out.println(st5);
        
    }
}