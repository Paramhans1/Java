/* 
Method Overriding: If child class implements the same method present in the parent class again , it is known as method Overriding
                   Redefining method of super class in sub class
                   when an object of subclass is created and the overrided method is called, then the method which has been implemented again in sub class is executed with changes
                   It is used to provide a different implementation of the method that is already provided by its superclass.
Rule:
      Method Overriding can be performed only when both the method have same Argument list
      example: both have 2 argument or paramener
               mac(int a, int b){}               and            mac(int x, int y){}
      Method Overriding can be performed only when both the method have same return type
      example: both have int return type
      both shhould have same "Access Modifier"
      example: both should be public 
      we cant override "static"  and "final" methods
*/

package example_035;
class A{
    public void meth1(){
        System.out.println("Method 1 of class A");
    }
    public void meth2(){
        System.out.println("Method 2 of class A");
    }
}
class B extends A{
    @Override
    // Method Overriding
    public void meth2(){                                                 // same method name
        System.out.println("Method 2 of class B");                       // changed the functionality
    }
    public void meth3(){
        System.out.println("Method 3 of class B");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.meth1();
        obj1.meth2();
        obj2.meth1();
        obj2.meth2();
        obj2.meth3();

    }
}