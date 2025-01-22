// Constructor from Thread Class:
package example_057;

class MyTh extends Thread{
    // constructor 
    public MyTh(String name) {
        // passing "thread_name" to Thread class Constructor
        super(name);
    }
    public void run(){
        for(int i = 0; i < 34; i++){
            // This the method of Thread Class which returns the Thread Name
            System.out.println("This is thread name: "+getName());
        }
    }
    
}
    
    public class Main {
        public static void main(String[] args) {
            // This is the Thread name Later on we can use This String to refer "Thread"
            // Thread(String name)
            MyTh t = new MyTh("MyThread");
            // Thread(String name)
            MyTh t1 = new MyTh("Rahul");
            t.start();
            t1.start();
            System.out.println("This is Thread Id: "+ t.getId());  
            System.out.println("This is Thread Id: "+ t1.getId());

            // Thread(Runnable r, String name)
            // -------try this-----------

    }
}