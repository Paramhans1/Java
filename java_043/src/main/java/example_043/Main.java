// INHERITANCE
// Inheritance in Interfaces: interfaces can extends another interfaces
//                            interface can not implement another interface
package example_043;
// Creating an Interface
interface sampleInterface{
    void meth1();
    void meth2();
}
// creating a child interface and extending it to parent interface 
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
// Creating a class that implements the interface
class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("Method 1");
    }
    public void meth2(){
        System.out.println("Method 2");
    }
    public void meth3(){
        System.out.println("Method 3");
    }
    public void meth4(){
        System.out.println("Method 4");
    }
}
public class Main {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}