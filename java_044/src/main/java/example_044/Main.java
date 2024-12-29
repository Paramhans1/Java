// Polymorphism:
package example_044;
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
    void connectToNetwork(String network);
}

// Creating a Interface
interface Camera{
    void takeSnap();
    void click();

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
        GPS g = new SmartPhones();            // This is the Smartphone but use it as as GPS.
                                              // GPS is reference of "g" but "g" is object of SmartPhone class. hence it only be used for the methods GPS which are implemented in SmartPhone class
        g.getDirection();
        g.connectToNetwork("Google");
        // g.click(); -------------------> Not allowed
        // g.play(); -------------------> Not allowed
        // g.takeSnap(); -----------------> Not allowed
        // Because "g" is reference of GPS interface and it only be used for the methods GPS




        Camera c = new SmartPhones();        // This is Smartphone but use it as a camera
                                             // Camera is reference of "c" but "c" is object of SmartPhone class. hence it only be used for the methods Camera which are implemented in SmartPhone class
        c.takeSnap();
        c.click();
        // c.getDirection(); -----------------> Not allowed
        // c.connectToNetwork("Google"); ------> Not allowed
        // c.play(); ------------------------> Not allowed
        // Because "c" is reference of Camera interface and it only be used for the methods Camera




        MediaPlayer m = new SmartPhones();    // This is Smartphone but use it as a media player
                                              // MediaPlayer is reference of "m" but "m" is object of SmartPhone class. hence it only be used for the methods MediaPlayer which are implemented in SmartPhone class
        m.play();
        // m.getDirection(); -----------------> Not allowed
        // m.connectToNetwork("Google"); ------> Not allowed
        // m.takeSnap(); ----------------------> Not allowed
        // m.click(); --------------------------> Not allowed
        // Because "m" is reference of MediaPlayer interface and it only be used for the methods MediaPlayer




        CellPhone cp = new SmartPhones();       // This is SmartPhone but only use it as CellPhone(just for calling and picking call)
                                                // CellPhone is reference of "cp" but "cp" is object of SmartPhone class
                                                // CellPhone is reference of "cp" but "cp" is object of SmartPhone class. hence it only be used for the methods CellPhone which are inherited in SmartPhone class
        cp.call();
        cp.pickCall();
        // cp.getDirection(); -----------------> Not allowed
        // cp.connectToNetwork("Google"); ------> Not allowed
        // cp.takeSnap(); ----------------------> Not allowed
        // cp.click(); --------------------------> Not allowed
        // cp.play(); ---------------------------> Not allowed
        // Because "cp" is reference of CellPhone interface and it only be used for the methods





        SmartPhones sm = new SmartPhones();     // "sm" is object of SmartPhone . hence can be used for all the methods implemented in SmartPhone class
        sm.getDirection();
        sm.connectToNetwork("Google");
        sm.takeSnap();
        sm.click();
        sm.play();
        sm.call();
        sm.pickCall();
    }
}