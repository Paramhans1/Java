// FUNCTIONAL PROGRAMMING: A programming paradigm where functions can act like variables
/* 
Lambda Expressions: lambda allow us to create function type variable just like any other variable but the value of that variable will be a function and they dont need to belong to any class . they can but it is not necessary
                    value of that variable is going to be a function
                    (no name, no return type, no access modifier)
                    used to implement functional interface
                    functional interface: means interfaces having only one single method()
                                          hence we can implement such functional interface  by using lambda expresion.
                    example: add = (a,b) -> a+b;
                             variable_name = (parameters) -> {
                             ...
                             };
                             lambda expression is an anonymous function
                 
*/

package functional_01;

import java.util.function.Predicate;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // without using Lambda Expression
        Thread w = new Thread(new Welcome());




        // using lambda function ---------------------> just remove method name, remove return type, remove access modifier)
        Thread w1 = new Thread(() -> {
            System.out.println("Welcome to office");
        });




        // when we have only one statement we no need to write return statement;
        // since we already defined the operation() parameter as "int a, int b" we no need to explicitly mention "datatype in lambda method"
        // we are using reference of interface to hold lambda expression;
        MathOperation sumOperation = (a, b) -> a+b;
        MathOperation subOperation = (a, b) -> a-b;
        MathOperation mulOperation = (a, b) -> a*b;
        MathOperation divOperation = (a, b) -> a/b;
        // datatype variable_name = lambda_expresion_name.Interface_method(parameter);
        int res1 = sumOperation.operation(1, 2);
        System.out.println(res1);
        int res2 = subOperation.operation(5, 6);
        System.out.println(res2);
        int res3 = mulOperation.operation(7, 8);
        System.out.println(res3);
        int res4 = divOperation.operation(9, 10);
        System.out.println(res4);
        
        
        // PREDICATE: it predict(check) the result as true or false
        // functional Interface (Boolean valued function). it is used to check condition
        // Predicate is a functional interface which takes only "one argument" and returns a boolean value;
        // ie, boolean test (T t);
        // Predicate<parameter_datatype> boolean_variable_name = (parameter) ->{};
        Predicate<Integer> isEven = x -> x%2 == 0;
        // datatype variable_name = lambda_expresion_name.Interface_method(parameter);
        System.out.println(isEven.test(10));
        

        // Predicate<parameter_datatype> boolean_variable_name = (parameter) ->{};
        Predicate<String> isWordStartsWithA = x -> x.toLowerCase().startsWith("a");
        // datatype variable_name = lambda_expresion_name.Interface_method(parameter);
        System.out.println(isWordStartsWithA.test("Anjali"));

        // Predicate<parameter_datatype> boolean_variable_name = (parameter) ->{};
        Predicate<String> isWordEndsWithA = x -> x.toLowerCase().endsWith("t");
        // datatype variable_name = lambda_expresion_name.Interface_method(parameter);
        System.out.println(isWordEndsWithA.test("Anjali"));

        // Predicate <parameter_datatype> boolean_variable_name = predicate1.and(predicate2)
        Predicate<String> ans = isWordEndsWithA.and(isWordEndsWithA);
        System.out.println(ans.test("Ankit"));
    }
}


// without using Lambda Expression
class Welcome implements Runnable{
    public void run() {
        System.out.println("Welcome to office");
    }
}
// Functional inteface: interface having only one method
//                      hence make sure to mention "@FunctionalInterface" annotation. which will indicate that since it "functional interface" we are not allowed to write more than one method inside it
@FunctionalInterface                                                        // Anotation
interface MathOperation{
    int operation(int a, int b);
}