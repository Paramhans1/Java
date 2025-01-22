package exception_05;

class NegativeRadiusException extends Exception{
    public String toString(){
        return "Radius can not be negative";
    }
    public String getMessage(){
        return "I am getMessage";
    }

}
public class Main {
    // we use "throws" to indicate program that this code can throw exception for certain condition . hence that need to be handled carefully for later updation
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            // "throw" is used to throw exception by programer itself
            throw new NegativeRadiusException();
            //throw new your_custom_exception_class_name
        }

        return 3.14*r*r;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            int c = divide(6, 1);
            System.out.println(c);
            double b = area(0);
            System.out.println(b);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}