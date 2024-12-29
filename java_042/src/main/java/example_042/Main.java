// Java Interface Eample & default Methods:
/* 
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
Default methods:
- Default methods enable us to add new functionality to exixting Interfaces
- Introduced in Java 8. to ensure backward compatibility while updating an interface.
- Classes implementing interface need not implement the default methods.
  ie, at last minute you have to add a method in interface, then compulsary we have to implement that in sub class orelse it will throw an error
    thats why we have to mention that method as Default.
- we can also override the default method during implementing.
- Interface can also include private methods for default methods to use
Private methods:
- Sub class can't implement Private methods. Then why to use this?
- sometimes default method logic become too big and complex . then we shift a part of code to "private method" and access it through the default "method" present in the same class
- we can directly use private method.
*/ 
package example_042;

// Creating a Super Class
class CellPhone{
    void call(){
        System.out.println("Calling...");
    }
    void pickCall(){
        System.out.println("Picking Call...");
    }
}

// Creating a Interface
interface GPS{
    void getDirection();
    String[] getNetworks();
    void connectToNetwork(String network);
}

// Creating a Interface
interface Camera{
    void takeSnap();
    void click();
    // Sub class can't implement Private methods. Then why to use this?
    // sometimes default method logic become too big and complex . then we shift a part of code to "private method" and access it through the default "method" present in the same interface
    private void greet(){
        System.out.println("Hello...");
    }
    // Classes implementing interface need not implement the default methods.
    default void record4kVideo(){
        greet();
        System.out.println("Recording 4K Video...");
    }

}
// Creating a Interface
interface MediaPlayer{
    void play();
}

class SmartPhones extends CellPhone implements GPS, Camera, MediaPlayer{
    // Implementing the methods of interface 
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    // Implementing the methods of interface
    public void getDirection(){
        System.out.println("Getting Direction...");
    }
    // Implementing the methods of interface
    public String[] getNetworks(){
        System.out.println("getting networks");
        String[] networks = {"Airtel", "Jio", "Vodafone"};
        return networks;
    }
    // Implementing the methods of interface
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
    // Implementing the methods of interface
    public void click(){
        System.out.println("Clicking...");
    }
    // Implementing the methods of interface
    public void play(){
        System.out.println("Playing...");
    }
} 

public class Main {
    public static void main(String[] args) {
        SmartPhones sm = new SmartPhones();
        sm.record4kVideo();
        sm.call();
        sm.pickCall();
        String[] ar = sm.getNetworks();
        for(String item : ar){
            System.out.println(item);
        }
    }
}