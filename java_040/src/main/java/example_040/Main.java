/*
Interface: we can implement one single class(subclass) to multiple interfaces(superclass)
           but similarly we can not extends a single "sub class" to multiple "super class" (multiple inheritance is not supported in java)
*/
package example_040;
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
class AvonCycle implements Bicycle, HornBicycle{
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