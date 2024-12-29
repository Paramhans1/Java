// Constructor in Inheritance:
/*
when the "Derived class" is extended from the "base class" the constructor of the "Base class" is executed first 
followed by the constructor of the "derived class"
the constructor are executed in the order of (top to bottom)
constructor1 (parent)              
constructor2 (child)
constructor3 (grandchild)

when there are multiple constructor in the parent class the constructor without any parameter is called from the child class
if we want to call the constructor with parameter from the parent class we can use "super" keyword
example:
       super(a, b) --------------------> calls the constructor from the parent class which takes 2 argument
*/
package example_033;
class Base{
    Base(){
        System.out.println("I am a Base class constructor");
    }
    Base(int x){
        System.out.println("I am an overloaded constructor of Base class with value of x as: "+ x);
    }
}

class Derived extends Base{
    Derived(){
        // super();
        System.out.println("I am a derived class Construvtor");
    }
    Derived(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of derievd class with value of y as: "+ y);

    }
}

class childOfDerived extends Derived{
    childOfDerived(){
        super();
        System.out.println("I am a child of derived class constructor");
    }
    childOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of child of derived class with value of z as: "+ z);
    }
}

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println("Base : ");  
        Base b = new Base();
        // Base b = new Base(10);
        System.out.println("Derived : ");
        Derived d = new Derived();
        // Derived d = new Derived(10,20);
        System.out.println("Child : ");
        // childOfDerived cd = new childOfDerived();
        childOfDerived cd = new childOfDerived(10, 20, 30);
    }
}