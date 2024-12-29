// Dynamic Method Dispatch: 
/* 
           super class      ------------------------------------------>     sub class
            |        |                                                       |      |
           meth1    meth2                                                  meth2   meth3
                                                                        (overriden)
    Senario 1 :  Super obj = new Sub();     ---------------------> Allowed
                 obj.meth1()
                 obj.meth2()                ---------------------> meth2 of Sub class is called
                 obj.meth3()                ---------------------> not allowed
    Senario 2 :  Sub obj = new Super();     ---------------------> not allowed

    "obj" is the object of sub class but refer to Super class. hence we can only acces the method of "super class" or overriden method from both class.
    but since it is also the object of "sub class" it gives priority to the overriden method present in "sub class".
*/
package example_036;
class Super{
    public void meth1(){
        System.out.println("Super class meth1");
    }
    public void meth2(){
        System.out.println("Super class meth2");
    }
}
class Sub extends Super{
    public void meth2(){
        System.out.println("Sub class meth2");
    }
    public void meth3(){
        System.out.println("Sub class meth3");
    }
}
public class Main {
    public static void main(String[] args) {
        Super obj = new Sub();                          // "obj" is the object of sub class but refer to Super class
        obj.meth1();                                    // meth1 of Super class is called
        obj.meth2();                                    // meth2 of Sub class is called
        //obj.meth3();                                  // not allowed
        }
}