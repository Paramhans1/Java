// BiPredicate, BiConsumer, BiFunction
// As name suggest it will take two parameter as input
package functional_03;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // BI-PREDICATE:
        // BiPredicate<parameter1_type, parameter2_type> variable_name = (parameter1, parameter2) -> {};
        BiPredicate<Integer,Integer> isEven = (x,y) -> (x+y) % 2 == 0;
        System.out.println(isEven.test(5,5));






        // BI-FUNCTION:
        // BiFunction<parameter1_type, parameter2_type, return_type> variable_name = (parameter1, parameter2) -> {};
        BiFunction<String, String, Integer> len = (x, y) -> (x+y).length();
        System.out.println(len.apply("Hello", "World"));





        // Unary Operator: we use this to replace "Function" whoes both "parameter_type" and "return_type" is same.
        UnaryOperator<Integer> a = x -> 2*x;
        System.out.println(a.apply(5));
        // Binary Operator: we use this to replace "BiFunction" whoes both "parameter1_type, parameter2_type" and "return_type" is same.
        BinaryOperator<Integer> b = (x,y) -> x+y;
        System.out.println(b.apply(5,5));




        // BiConsumer<parameter1_type, parameter2_type> variable_name = (parameter1, parameter2) -> {};
        BiConsumer<Integer, Integer> print = (x, y) -> System.out.println(x+y);
        print.accept(50,5);



        // Method Reference: use method without invoking or in place of lambda expression
        List<String> students = Arrays.asList("Ram", "Shyam", "Ghanshyam");
        students.forEach(x -> System.out.println(x));
        // Instead if "lambda expression" we used method reference;
        // here we are giving itself method as parameter(ie, we are giving print method as parameter to "for each")
        students.forEach(System.out::println);




        // Constructor Reference: 
        List<String> names = Arrays.asList("A","B","C");
        List<MobilePhone> pList = names.stream().map(x -> new MobilePhone(x)).collect(Collectors.toList());
        // Instead of lambda expression we used constructor reference
        List<MobilePhone> pList2 = names.stream().map(MobilePhone::new).collect(Collectors.toList());
        
    }
}