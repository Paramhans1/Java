/*
This Keyword:
"this" keyword is a reference to the current object of the class and is used to access variables
and methods of the current object.
*/
package example_034;

class Ekclass{
    int x;
    int y;
    Ekclass(int a, int b){
        x = a;
        this.y = b;                              // when we mention "this.b" that means Im talking about the object of the current class
        System.out.println("I am in Ekclass");
    }
}

class Derived extends Ekclass{
    Derived(int p, int q){
        super(p,q);                              // super keyword is used to call the constructor of the parent class
        System.out.println("I am a constructor");
    }

}
public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Ekclass e = new Ekclass(65, 95);
        System.out.println("lets try Derived constructor");
        Derived d = new Derived(45, 75);
        System.out.println(e.x);
        System.out.println(e.y);

    }
}

/*
Super Keyword:
A reference variable used to refer immediate parent class object
can be used to refer immediate parent class instance variable
can be used to invoke parent class methods
can be used to invoke parent class constructor
*/