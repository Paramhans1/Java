// OOP: object oriented programing:
/*
CLASS:
Noun     -------->    Class    --------->     Employees
Adjective-------->    Attribute--------->     name, age, salary
Verb     -------->    Methods  --------->     getSalary(), increment()
*/



/*
OBJECT:
Noun     -------->    Object   --------->     Profile of a Particular Employee
Adjective-------->    Attribute--------->     name = rakesh, age = 27, salary = 500000
Verb     -------->    Methods  --------->     getSalary(true), increment(false)
*/


/*
OOPs Terminology:
Abstrasction:   Hiding internal details and shows only essential information
                example: using phone without bothering about how it was made
                
Encapsulatioin: The act of putting various components together(in a capsule)
                example: a car has engine, wheels, steering, etc.
                example: Laptop is a Single entity with wifi + Speaker + Storage + progessor + battery in a Single box!

Inheritance:    The act of deriving new things from existing thing
                example: Use Rickshow ------------------------->  E - Rickshow
                example: Use Car      ------------------------->  E - Car
                example: phone        ------------------------->  SmartPhone
                using previous research on phones to build Smart-Phones. No need to start research from scratch
                
Polymorphism:   One entity many forms
                example: Smartphone --------> Phone, Calculator, tv remote, radio, tv, camera.....etc 
*/
package example_025;

//  one "Java file" can have only one "Public Class"
class Employee{
    // attributes
    String name;
    int age;
    double salary;
    // methods or behaviour
    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
    public void getSalary(){
        System.out.println(name +" Your salary "+salary+" is released");
    }
}
public class Main {

    public static void main(String[] args) {
        // Instantiating a new Employee Object or creating an object for class Employee
        Employee harry = new Employee();   
        Employee jhon = new Employee();

        // Setting Attribute for harry
        harry.name = "Harry";
        harry.age = 25;
        harry.salary = 50000;
        // Setting Attribute for jhon
        jhon.name = "Jhon";
        jhon.age = 30;
        jhon.salary = 60000;

        // Calling Method
        harry.printDetails();
        harry.getSalary();
        jhon.printDetails();
        jhon.getSalary();
        
    }
}