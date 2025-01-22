// Creating Thread by implementing Runnable interface
package example_056;

class MyThreadRunnable1 implements Runnable{
    public void run(){
        for(int i = 0; i<100; i++){
            System.out.println("This is Thread1 not Threat1");
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
        for(int i = 0; i<100; i++){
            System.out.println("This is Thread2 not Threat2");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Thread(Runnable r)
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        // Thread(Runnable r)
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}


/* 
Life Cycle of thread:                 ___________________________________
1. New                                |                                  |
2. Runnable <-------------------------|        4.Non-Runnable            |
3. Running -------------------------->|                                  |
5. Terminated                         |__________________________________|

New - Instance of thread that is been created but yet to start by invoking start()
Runnable - After invocation of start() & before it is selected to be run by schedular
Running - After Thread schedular has selected, that is processing power is allocated
Non-Running - Thread is alive but not eligible to run or waiting for some resource
Terminated - Thread has completed its execution

*/