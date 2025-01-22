/* 
Difference between "concurrency" and "parallism"
concurrency: single person managing many task, that means when there is any urgency in any task that may impact other task
parallelism: multiple person working on different task, that means each task is independent and not impact other

Multi-Threading: Thread use shared memory area
                 Thread are faster than switching 
                 thread is light weight where as process is heavy weight
                 multi threading is used to achieve "concurrency"

-flow of control without threading:
    main() -------> func1() ----------> func2()

-flow of control with threading:
    main() --------------------.
                               |
            func1() --------------------------------------> END
                                         |
                        func2() ---------'


Creating a Thread:
1. By extending Thread Class
2. By implementing Runnable Interface
*/

package example_055;

// extending Thread class
class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Thread 1:");
            System.out.println("cooking thread is running");
            System.out.println();

        }
    }
}

// extending thread class
class  MyThread2 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Thread 2:");
            System.out.println("Chatting thread is running");
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        
        // creating objrct for MyThread class
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();


        // calling start() method
        t1.start();
        t2.start();
    }
}