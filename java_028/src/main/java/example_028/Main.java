// Constructor in Java: A method used to initialize an object while creating it.
//                      In order to write our own constructor we define method() name Same as Class name
//                      It is called when an object is created in a class and it allows the class to initialize the at the same time when an object is created.
//                      then there is no need to write "setter mathod()" for initializing private "attributes"
package example_028;

class Employee{
    private int Id;
    private String name;
    private int age;
    // Constructor: method with same name as Class name
    public Employee(int myId, String myName, int myAge){
        Id = myId;
        name = myName;
        age = myAge;
    }

    int getId(){
        return Id;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee harry = new Employee(45, "Harry", 21);
        // since those attributes are in private we cant access them by using "object.attribute_name"
        // System.out.println(harry.Id);
        // System.out.println(harry.name);
        // System.out.println(harry.age);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
        System.out.println(harry.getAge());
    }
}