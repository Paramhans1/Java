// Constructor Overloading: same constructor name with different number of parameters 
package example_029;

class Employee{
    private int Id;
    private String name;
    private int age;
    // Constructor: method with same name as Class name
    public Employee(){
        Id = 001;
        name = "Your-Name-Here";
        age = 25;
    }
    public Employee(int myId){
        Id = myId;
        name = "Your-Name-Here";
        age = 25;
    }
    public Employee(int myId, String myName){
        Id = myId;
        name = myName;
        age = 25;
    }
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
        Employee harry = new Employee();
        // Employee harry1 = new Employee(45);
        // Employee harry2 = new Employee(45, "Rahul");
        // Employee harry3 = new Employee(45, "Rahul", 31);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
        System.out.println(harry.getAge());
        
    }
}