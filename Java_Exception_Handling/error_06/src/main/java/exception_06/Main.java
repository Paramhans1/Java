// finally block: finally block contain the code which is always executed weather the exception occur or not
package exception_06;

public class Main {
    public static int greet(){
        // example:3
        try{
            int a = 10;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        // Even though it has to return from "c" and since no exception found. but still executed the finally block;
        finally{
            System.out.println("This is finally block");
        }
        return 0;
    }
    public static void main(String[] args) {
        int c = greet();
        System.out.println(c);
        int a = 100;
        int b = 10;
        // example:2
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("finally block for b = "+b);
            }
            b--;
        // example:1
        }
        try{
            int p = 10;
            System.out.println(p);
        }
        finally{
            System.out.println("try can not be alone. either try-catch, try-catch-finally, try-finally");
        }
    }
}