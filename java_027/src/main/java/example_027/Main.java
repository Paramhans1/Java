/*
Access Modifiers: specifies where the attribute, methods are accessible
1. Public: Accessible from anywhere in the program.
2. Private: Accessible only within the class where it is declared.
3. Protected: Accessible within the class where it is declared and in any class that
4. Default:
*/
package example_027;

class Employee{
    // since id, name are are made "private" we cant set their value using .object from main class 
    private int id;
    private String name;
    int age;
    double salary;
    // since id, name are are made "private" we can set there value by using setId() and setName()
    void setId(int i){
        id = i;
    }
    int getId(){
        return id;
    }

    void setName(String n){
        name = n;
    }
    String getName(){
        return name;
    }

    public void printDetails(){
        System.out.println("Employee ID: "+id);
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
        Employee harry = new Employee();
        // harry.id = 45;               ---------------------> Throws an erroe due to private access modifier
        // harry.name = "Harry";        ---------------------> Throws an erroe due to private access modifier
        harry.age = 25;
        harry.salary = 5000;
        harry.setId(45);
        harry.setName("Harry");
        harry.printDetails();
        harry.getSalary();
    }
}