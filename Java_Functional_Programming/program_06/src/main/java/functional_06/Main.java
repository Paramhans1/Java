// Terminal Operation: used to extract result from stream
package functional_06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // .collect()
        List<Integer> L1 = list.stream().skip(1).collect(Collectors.toList());                                                    // "collect" is a terminal method which returns "Collectors" of type "list or set or map....etc"
        Set<Integer> S = list.stream().skip(5).collect(Collectors.toSet());                                                     // .toSet convert to Collector to type "Set"
        List<Integer> L2 = list.stream().skip(8).toList();
        System.out.println(L1);
        System.out.println(S);
        System.out.println(L2);



        // .forEach(Consumer)
        list.stream().forEach(x -> System.out.printf("%d\t",x));
        System.out.println();



        // .reduce(binaryOperator) ----------------------------------------------------------------------------------------------> Combines element to produce a single result
        Optional<Integer> sum = list.stream().reduce((a,b) -> a+b);
        System.out.println(sum.get());



        // .count()
        long count = list.stream().count();
        System.out.println(count);



        // .anyMatch(),    .allMatch(),    .noneMatch()  ----------------------------------------------> these are "short circuit methods" which means as soon as the given condition matches. it returns. it wont bother checking other rest element
        boolean m1 = list.stream().anyMatch(x -> x>5);                                                   // as soon as any match it returns true , it wont check others elements
        System.out.println("anyMatch"+m1);
        boolean m2 = list.stream().allMatch(x -> x>5);                                                   // as soon as any dont match it returns false, it wont check rest
        System.out.println("allMatch"+m2);
        boolean m3 = list.stream().noneMatch(x -> x<0);                                                  // as soon as any match it returns false, it wont process rest
        System.out.println("noneMatch"+m3);





        // findFirst(), findAny()                                                                            // short circuit methods
        Optional<Integer> first = list.stream().findFirst();                                                 // return first element
        System.out.println(first.get());
        Optional<Integer> any = list.stream().findAny();                                                     // whichever element it find . it return that . no order
        System.out.println(any.get());





        
        // .toArray()
        List<String> list1 = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam","Anjali","Akshit");
        String[] array = list1.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(array));
        Object[] arr1 = Stream.of(1, 2, 3, 4, 5 ,6).toArray();
        System.out.println(Arrays.toString(arr1));




        // .min() / .max()
        System.out.println("max: "+ Stream.of(2, 3, 4, 97, 69).max((a,b) -> a - b).get());
        System.out.println("min: "+ Stream.of(2, 3, 4, 97, 69).min(Comparator.naturalOrder()).get());





        // Examples : filtering names by length>3
        List<String> names = Arrays.asList("John", "Mary", "David", "Emma", "Anna", "Bob");
        System.out.println(names.stream().filter(x -> x.length()>3).toList());




        // Examples : square and sort numbers
        List<Integer> num1 = Arrays.asList(7, 5, 9, 2, 3,1);
        System.out.println(num1.stream().map(x -> x*x).sorted().toList());



        // Examples : Summing Values
        List<Integer> num2 = Arrays.asList(7, 5, 9, 2, 3, 8);
        System.out.println(num2.stream().reduce((a,b) -> a+b).get());



        // Examples : counting Occurance of character
        String str = "Hello World";
        // we can convert arrays into streams but not "char Arrays"
        // string_name.chars() -------------------------------------------------------------------------> creates a stream of ASCII values of corresponding charcter
        System.out.println(str.chars().filter(x -> x == 'l').count());





        // stateful  &  stateless operation:
        // stateful operation : operation which depends on previous elements or upcomming element (example: sorted())
        // stateless operation : operation which does not depend on previous element or next upcomming element (example: map(), filter())
        
    }
}