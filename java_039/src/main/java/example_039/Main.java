// ABSTRACTION:
/* Abstract Method
   - A methods that is declared without an implementation is called abstract method
   example: abstract void moveTo(int x, double y)

   Abstract Class
   - If a class includes abstract methods, then the class itself must be declared "abstract"
   example: public abstract class Vehicle {
                abstract void moveTo(int x, double y);
            }
    - An abstract class can have both abstract and non-abstract methods
    - we use abstract class to create "concrete sub class" [ie: every method of abstract class is defined or implemented in "sub class"]
    - It is not possible to create object of abstract class
    - But it is possible to create reference of "abstract class" (Dynamic method Dispatch)
    - we can create object of "sub class" and can provide reference of "abstract class" (Dynamic method Dispatch)
    - we can create object of "sub class".
   */
package example_039;
// abstract class 
abstract class Base{
    // constructor
    Base(){
        System.out.println("I am Base class constructor");
    }
    // non-abstract method 
    public void sayHello(){
        System.out.println("Hello from Base class");
    }
    // abstract method 
    abstract public void greet();
}
// sub class extends abstract class
class Derived extends Base{
    // implementation of abstract method (overriden)
    public void greet(){
        System.out.println("Good Morning");
    }
}
/* 
when a "sub class" extends an "abstract class". then "sub class" usually provide implimentation of all the method of "abstract class"[ie: override "abstract merhod"]. 
If it doesn't, then "sub class" must be declared abstract 
*/
abstract class ChildDerived extends Base{
    //non-abstract method
    public void th(){
        System.out.println("I am good");
    }
}

public class Main {
    public static void main(String[] args) {
        // we can not create object for abstract class
        // Base obj = new Base();
        Derived d = new Derived();
        d.sayHello();
        d.greet();
        // ChildDerived cd = new ChildDerived();
        // But we can create object of "sub class" and provide reference of "abstract class"
        Base b = new Derived();
        b.sayHello();
        b.greet();

    }
}