/* 
Exception Class in java:---------------------------------------------------------------> Custom Exception
we can write our custom Exception using Exception Class in java
public class MyException extends Exception{
    ......
    }

following are important methods:
String getMessage() ----------------------> print execution message
String toString() ------------------------> executed when sout(e) runs
void printStackTrace() -------------------> print stacks trace

"throw" -------------------------------------------------------------------------------> throw keyboard is used to throw an exception explicitly by programmer
*/
package exception_04;

import java.util.Scanner;
// Your_custom_Exception_class extends Exception
class MyException extends Exception{
    public String toString(){
        return "I am toStrings";
    }
    public String getMessage(){
        return "I am getMessage";
    }

}

public class Main {
    public static void main(String[] args) {
        int a ;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try{
                // throw new MyException();
                throw new ArithmeticException("This is an exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}