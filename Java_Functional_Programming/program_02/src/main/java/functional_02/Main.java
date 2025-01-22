package functional_02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        // FUNCTION: it perform some function;
        // Function Interface: is a functional interface which contain a single method  
        // return type apply(T t)
        // Funtion<parameter_datatype, return_type> variable_name = parameter -> {}
        Function<Integer, Integer> doubleIt = x -> 2*x;
        Function<Integer, Integer> tripleIt = x -> 3*x;

        // variable_name.apply_method(parameter);
        System.out.println(doubleIt.apply(10));
        System.out.println(tripleIt.apply(10));

        // variable1.andThen(variable2).apply(20) --------------------> this mean take input of 20 in lambda_Expression1(variable1). then use result of variable as the input of variable2
        int a = doubleIt.andThen(tripleIt).apply(20);                   // first "doubleIt" executed then "tripleIt"
        int b = doubleIt.compose(tripleIt).apply(20);                   // first "tripleIt" executed then "doubleIt"

        System.out.println(a);
        System.out.println(b);

        // "function" also has one static method
        // ie, identity()
        // to refer static method of interface we use. Interface_name.method_name()
        // returns the same value which was given as input
        // Funtion<parameter_datatype, return_type> variable_name = parameter -> {};
        Function<Integer, Integer> id = Function.identity();
        // variable_name.function_method(parameter);
        int ans = id.apply(5);
        System.out.println(ans);







        // CONSUME : It consume and do not return anything
        // Consumer Interface: is a functional interface which contain a single method
        // ie, void accept(T t)
        // Consumer<parameter_datatype> variable_name = parameter -> {};
        Consumer<Integer> printIt = x -> System.out.println(x);
        // variable_name.consumer_method(parameter);
        printIt.accept(10);
        List<Integer> List = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<List<Integer>> printList = x -> {
            for(int i : x){
                System.out.println(i);
            }
        };
        printList.accept(List);









        // SUPPLIER: It doesnt take anything from us but in return supply us
        // Supplier Interface: is a functional interface which contain a single method
        // ie, return_datatype get()
        // Supplier<parameter_datatype> variable_name = () -> {};
        Supplier<String> giveHello = () -> "Hello Every one!";
        // variable_name.supplier_method(parameter);
        System.out.println(giveHello.get());








        // Combined example
        Predicate<Integer> pre = x -> x%2 == 0;
        Function<Integer, Integer> fun = x -> x*x;
        Consumer<Integer> con = x -> System.out.println(x);
        Supplier<Integer> sup = () -> 100;

        // first Supplier supply value to predicate. predicate check weather the value is even or not.
        // if value is even then predicate return true and predicate value is passed to function
        // function square the value and consumer print the value
        if(pre.test(sup.get())){
            con.accept(fun.apply(sup.get()));
        }


    }
}