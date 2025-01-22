package functional_07;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Bob","Charlie","David");
        Stream<String> st = names.stream()
        .filter(n -> {
            System.out.println("Filtering: "+ n);                                                         // This Statement only execute . when terminal method is performed
            return n.length() > 3;
        });

        System.out.println("Before terminal operation");                                                   // hence First this statement will be printed
        List<String> res = st.collect(Collectors.toList());                                                // since terminal method is added . then "st" stream is executed
        System.out.println("After terminal operation");
        System.out.println(res);


        System.out.println();



        // Stream:
        long start1 = System.currentTimeMillis();
        List<Integer> list1 = Stream.iterate(1, i -> i+1).limit(20000).toList();
        List<Long> factorialList1 = list1.stream().map(x -> factorial(x)).toList();                                                                // Stream implementation
        long end1 = System.currentTimeMillis();
        System.out.println("Time taken by stream: " + (end1 - start1));


        // Parallel Stream:
        // A type of stream that enables parallel processing elements
        // Allows multiple threads to process parts of stream simultaneously
        // It is used when we have a large data set and we want to process it in parallel
        // It is used when we have a CPU intensive operation where tasks are independent
        // Parallel Stream dont follow order of execution
        long start = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, i -> i+1).limit(20000).toList();
        List<Long> factorialList = list.parallelStream().map(x -> factorial(x)).toList();                                                         // Parallel stream implementation
        long end = System.currentTimeMillis();
        System.out.println("Time taken by parallel stream: " + (end - start));


        // Cumulative Sum : A cumulative sum is a sum of all elements up to that point
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cs = number.parallelStream().map(sum::addAndGet).toList();
        System.out.println("Expected:[1, 3, 6, 10, 15, 21, 28]");
        System.out.println("Actual:"+cs);                                                                                                         // we get different result because tasks are not independent
        



        // .sequential() ------------------------------------------------------------------------------------------------------------------------> convert Parallel Stream into Sequential Stream . [ie. normal stream()]
        List<Integer> number1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        AtomicInteger sum1 = new AtomicInteger(0);
        List<Integer> cs1 = number.parallelStream().sequential().map(sum::addAndGet).toList();
        System.out.println("Expected:[1, 3, 6, 10, 15, 21, 28]");
        System.out.println("Actual:"+cs1); 
    }
    private static long factorial(int x) {
        long result = 1;
        for(int i = 2; i<=x; i++){
            result = result * i;
        }
        return result;
    }


}