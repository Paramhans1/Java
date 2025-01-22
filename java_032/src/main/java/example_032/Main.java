/* INHERITANCE:
Inheritance:    The act of deriving new things from existing thing
                example: Use Rickshow ------------------------->  E - Rickshow
                example: Use Car      ------------------------->  E - Car
                example: phone        ------------------------->  SmartPhone
                example: Animal       ------------------------->  Dog
                example: Super class  ------------------------->  sub class or child class
                using previous research on phones to build Smart-Phones. No need to start research from scratch 
*/

package example_032;

// Creating a "Supper Class"
class Base{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void printMe(){
        System.out.println("This is my method()");
    }
}

// Creating a "Sub Class"
// sub class inherites the content of super class
class Derived extends Base{
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of "Base" class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        // b.setY(4);
        // System.out.println(b.getY());




        // Creating an object of "Derived" class
        Derived d = new Derived();
        d.setY(5);
        System.out.println(d.getY());
        d.setX(9);
        System.out.println(d.getX());
    }
}


/*
Java doesnt support multiple Inheritance
i.e: two class cannot be super class for a single sub class 
*/