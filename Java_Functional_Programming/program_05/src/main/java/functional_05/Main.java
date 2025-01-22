// Intermediate Operation: after converting any collection into stream we perform changes using Intermediate Operations
//                         Intermediate operation transform a stream into another stream
//                         Intermediate operation are lazy, meaning they wont execute until a terminal operation is invoked.
package functional_05;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // .filter(Predicate) -------------------------------------------------------------------------------------------------> used to check condition
        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam","Anjali","Akshit");
        Stream<String> fstr = list.stream().filter(x -> x.startsWith("A"));                                                    // Until and unless I apply terminal operation, this wont Execute
        // no filtering at this time
        fstr.forEach(System.out::println);                                                                                     //  "forEach" is a Terminal Operation
        long fstr1 = list.stream().filter(x -> x.startsWith("A")).count();                                                     // .count is a "Terminal Operation" it returns value of type "long"
        System.out.println(fstr1);
        // fstr.forEach(System.out::println);   ------------------------------------------------------------------------------> Stream can not be reused once terminal operation is called orelse it will give an error.


        // .map(Function) -----------------------------------------------------------------------------------------------------> used to perform changes or task
        Stream<String> stringStream = list.stream().map(x -> x.toUpperCase());
        stringStream.forEach(System.out::println);                                                                              //  "forEach" is a Terminal Operation


        // .sorted(Custom_comparator)
        Stream<String> sortedStream = list.stream().sorted((x, y) -> x.length() - y.length());
        sortedStream.forEach(System.out::println);                                                                              //  "forEach" is a Terminal Operation


        // .distinct()
        long distinctStream = list.stream().distinct().count();
        long distinctStream1 = list.stream().filter(x -> x.startsWith("A")).distinct().count();
        System.out.println(distinctStream);   
        System.out.println(distinctStream1);                                                                                     //  "count" is a Terminal Operation



        // .limit()
        Stream<String> limitStream = list.stream().limit(3);
        limitStream.forEach(System.out::println);                                                                              //  "forEach" is a Terminal Operation
        System.out.println(Stream.iterate(1, x -> x+1).limit(100).count());                                                    // here count starts from 1 to 100
        Stream<Integer> I = Stream.iterate(1, x -> x+1).limit(100);
        System.out.println(I.findFirst().get());




        // .skip()
        System.out.println(Stream.iterate(1, x -> x+1).skip(10).limit(100).count());                                            // here count starts from 11 t0 110
        Stream<Integer> S = Stream.iterate(1, x -> x+1).skip(10).limit(100);
        System.out.println(S.findFirst().get());




        // .peek() -------------------------------------------------------------------------------------------------------------> performs an action on each element as it is consumed
        long pk = Stream.iterate(1, x -> x+1).skip(10).limit(20).peek(System.out::println).count();





        //  .flatMap
        // Handle stream of collections, lists or arrays whwere each elements is itself a collection
        // Flatten nested structures(eg, lists within lists) so that they can be processed as a single sequence of elements
        // Transform and flatten elements at same time.
        List<List<String>> list1 = Arrays.asList(
            Arrays.asList("Apple", "Banana"),
            Arrays.asList("Orange", "kiwi"),
            Arrays.asList("Pear", "grapes")
        );
        System.out.println(list1.get(2).get(1));           
        System.out.println(list1.stream().flatMap(x -> x.stream()).map(x -> x.toUpperCase()).toList());



        List<String> sentences = Arrays.asList(
            "Hello world",
            "Java streams are powerful",
            "They can be used to process data",
            "flatMap is Used"
        );
        System.out.println(sentences.stream()
        .flatMap(x -> Arrays.stream(x.split(" ")))
        .map(x -> x.toUpperCase())
        .toList());
    }
}