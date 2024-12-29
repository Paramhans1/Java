/* 
Muliple Inheritance in Java is not supported but can be achieved by using Interface.
                  inheritance                      _______________________________
Cell Phone -------------------------------------> |                               |
                                                  |                               |
                  interface                       |                               |
GPS --------------------------------------------> |        Smart                  |
                                                  |        Phones                 |
                  interface                       |                               |
Camera------------------------------------------> |                               |
                                                  |                               |
                  interface                       |                               |
Media Player -----------------------------------> |_______________________________|

Why multiple inheritance is not allowed in java?
-Multiple inheritance face problem when there exist methods with same same in both super classes
-Due to such problem , Java does not support multiple inheritance directly but similar concept can be achieved using "Interfaces"
-A class can implement multiple Interface and etend a class at the same time.
Note:
    -Interface in java is bit like a Class but with a significant difference
    -Attribute of Interface are final by default we can not update it by using object.attribute
    -The class implementing an Interface needs to define all the methods 
    -You can create reference of Interface but not the object
    -Interface methods are public by default
*/
package example_041;
// creating a Super class
class Base{
    public void display(){
        System.out.println("Base class");
    }
}
// creating interface named "Bicycle"
interface Bicycle{
    // you can create properties or Attributes
    // You can not modify the Attributes of interface by using object as they are final
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
// creating a interface names "HoerBicycle"
interface HornBicycle{
    void blowHornk3g();
    void blowHornktm();
}
// creating a sub class which "extends" Base and "Implement" both Bicycle, HornBicycle
class AvonCycle extends Base implements Bicycle, HornBicycle{
    int speed = 30;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    // when we are implementing the methods of interface we have to make them public 
    public void applyBrake(int decrement){
        speed = speed - decrement;
        System.out.println("Brake applied");
        System.out.println("Speed = "+speed);
    }
    // when we are implementing the methods of interface we have to make them public 
    public void speedUp(int increment){
        speed = speed + increment;
        System.out.println("Speed is increased");
        System.out.println("Speed = "+speed);
    }
    // when we are implementing the methods of interface we have to make them public 
    public void blowHornk3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    // when we are implementing the methods of interface we have to make them public 
    public void blowHornktm(){
        System.out.println("kaho na pyar hai po po po po");
    }

}
public class Main {
    public static void main(String[] args) {
        // Create an instance of the interface
        AvonCycle cycleParam = new AvonCycle();
        cycleParam.display();
        cycleParam.applyBrake(10);
        cycleParam.speedUp(10);
        // You can not modify the Attributes of interface as they are final
        // cycleParam.a = 454;
        // System.out.println(cycleParam.a);
        System.out.println(Bicycle.a);
        cycleParam.blowHorn();
        cycleParam.blowHornk3g();
        cycleParam.blowHornktm();

    }
}