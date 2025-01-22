
/*
Collection framework: it provides set of interfaces and clases that help in managing group of object.
Interfaces 
1.collection: the root interface for all the other collection types
2.list: ordered collection of elements that can contain duplicate elements (eg: ArrayList, LinkedList);
3.set: unordered collection of elements that cannot contain duplicate elements(eg: HashSet, TreeSet);
4.map: An Interface that represent a collection of key-value pairs (eg: HashMap, TreeMap);
5.queue: a collection that follows the FIFO principle(eg: PriorityQueue);
6.dequeue: A double ended queue that allows insertion and removal from both ends (eg: ArrayDeque);
7.stack: a collection that follows the LIFO principle(eg: Stack);
there are few classes that implement these interfaces:

                                                                                Iterable
                                                                                   |
                                                                                Collection
                                                                                   |
                 .-----------------------------------------------------------------'-----------------------------------------------------------------------.
                 |                                                                 |                                                                       |  
                List                                                              Set                                                                    Queue
                 |                                                                 |                                                                       |                                          .------------ ArrayDeque
             ArrayList                                                          HashSet                                                                 Linkedlist                                    |
            LinkedList                                                          LinkedHashSet                                                          PriorityQueue                                  |------------ LinkedList
              Vector                                                            TreeSet                                                                  Dequeue -------------------------------------|
              Stack                                                              Enum                                                                  BlockingQueue                                  |------------ ConcurrentLinked
        CopuOnkiriteArrayList                                             SetConcurrentSkipListSet                                                    ArrayBlockingQueue                              |
                                                                                SortedSet                                                             LinkedBlockingQueue                             '------------- Deque
                                                                            CopyOnWriteArraySet                                                      PriorityBlockingQueue
                                                                                                                                                     Synchronous Queue
                                                                                                                                                        DelayQueue
                                                                                                                                                    ConcurrentLinkedQueue

when to use List:
key features:
        -Ordered Preservation
        -Allows Duplicates
        -Index-Based Access

since "list" is implemented by several classes, such as ArrayList, LinkedList, Vector, Stack. these all class will have above key features.
*/package collections_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList;
        ArrayList can change size dynamically as elements added or removed unlike array.
        Default size of ArrayList is "10".
        if internal Array of Arraylist is full, then create a new array with larger capacity(usually 1.5 times the current capacity. ie, growth factor 1.5)
        we can even create ArrayList with specified initial capacity.
        ArrayList declaration we can use any of 2 both are sann.
        */

        // ArrayList<dataType> ArrayList_name = new ArrayList(initial_capicity);
        ArrayList<Integer> A1 = new ArrayList<>(20);
        // List<dataType> ArrayList_name = new ArrayList();
        List<Integer> A2 = new ArrayList<>();



        //ArrayList_name.add(value); -------------------------------------------------------------------------------------------------> adds the element at the end of the list
        A1.add(1);
        A1.add(2);
        A1.add(3);
        // ArrayList name.get(Index, value); -----------------------------------------------------------------------------------------> add the element at the specified index and if there is a value at that index then it will move to next index
        A1.add(1,51);
        // ArrayList name.set(index, value); -----------------------------------------------------------------------------------------> replace the element at the specified index with the specified element
        A1.set(3, 52);
        //ArrayList_name.size(); -----------------------------------------------------------------------------------------------------> return size (ie, number of elements) not the initial size of arrayList
        System.out.println("size "+A1.size());
        // ArrayList name.get(); -----------------------------------------------------------------------------------------------------> return element at that particular index
        System.out.println("0th element. "+A1.get(0));
        //ArrayList name.contains(element); ------------------------------------------------------------------------------------------> return true if element is present in list else false
        System.out.println("2 is present in A1 "+A1.contains(2));
        A2.add(91);
        A2.add(92);
        A2.add(93);



        // ArrayList_name.remove(index); ---------------------------------------------------------------------------------------------> removes element of that index and all other values after that index will be shifted to left to accomodate the vacent position when we use Arrays.asList() then it is size of list created is fixed hence it wont allow "add()". but we can replace element. when we use Arrays.asList() then it is size of list created is fixed hence it wont allow "add()". but we can replace element.
        A2.remove(0);



        // how to print ArrayList
        System.out.println("ArrayList A2");
        for (Integer element: A2){
            System.out.println(element);
        }
        System.out.println("ArrayList A1");
        for(int i: A1){
            System.out.println(i);
        }
        System.out.println(A1);
        System.out.println(A2);




        // Other ways to create ArrayList
        List<String> l1 = Arrays.asList("Monday", "Tuesday", "Wednesday");
        //11.add("Thursday"); -----------------------------------------------------------------------------------------------------------> when we use Arrays.asList() then it is size of list created is fixed hence it wont allow "add()" . but we can replace element
        l1.set(1, "Thursday");
        System.out.println("l1: "+l1);
        String[] arr = {"Apple", "Banana", "Cherry"};
        List<String> l2 = Arrays.asList(arr);
        //12.add("Orange"); -----------------------------------------------------------------------------------------------------------> when we use Arrays.asList() then it is size of list created is fixed hence it wont allow "add()" . but we can replace element
        l2.set(1, "Orange");
        System.out.println("l2: "+l2);



        List<Integer> l3 =  List.of(1, 2, 3, 4);
        // 13.set(1, 180); ------------------------------------------------------------------------------------------------------------> when we use List.of() then list is immutable. Even replacing element in not allowed
        System.out.println("l3: "+l3);



        // if we want to add element in immutable list then we have to create new list using previous list.
        List<Integer> l4 = new ArrayList<>(l3);
        l4.add(100);
        l4.set(0,521);
        System.out.println("l4: "+l4);



        // List name.addAll(list);
        List<Integer> l5 = new ArrayList<>();
        l5.add(200);
        l5.add(300);
        l5.add (400);
        l5.addAll(l4);
        System.out.println("l5: "+l5);



        List<String> l6 = new ArrayList<>();
        l6.add("Apple");
        l6.add("Banana");
        l6.add("Cherry");
        l6.add("Dates");
        l6.add("Elderberry");
        System.out.println("l6: "+l6);
        // It works fine Array List is of type "String"
        //List name.remove("string") ---------------------------------------------------------------------------------------------------> remove by value
        l6.remove("Apple");
        System.out.println("l6: "+l6);
        //List name.remove(Index) ------------------------------------------------------------------------------------------------------> renove by Index
        l6.remove(0);
        System.out.println("l6: "+l6);



        List<Integer> l7 = new ArrayList<>();
        l7.add(200);
        l7.add(300);
        l7.add(400);
        l7.add(500);
        System.out.println("l7: "+l7);
        // remove by index
        // When the list is of type "Integer" or any other pinitive type then it will only consider ".remove(index)" by default, hence directly can remove by value
        l7.remove(1);
        System.out.println( "l7: "+l7);


        // remove by value
        l7.remove((Integer) 400);
        l7.remove(Integer.valueOf(200));
        System.out.println("l7: "+l7);


        //List_name.clear(): clear the list
        l7.clear();
        System.out.println("l7: "+l7);



        //convert list. to array
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // array_Object_type[] array_name = list_name.toArray(new array_Object_type[0]);
        Integer[] array1 = list.toArray(new Integer[0]);
        String s = Arrays.toString(array1);
        System.out.println("array1: "+s);
        System.out.println("array1: "+array1[0]);
        System.out.println("array1: "+array1[1]);
        System.out.println("array1: "+array1[2]);




        List<Integer> l8 = new ArrayList<>();
        l8.add(10);
        l8.add(2);
        l8.add(300);
        l8.add(14);
        l8.add(50);
        l8.add(6);

        // how to sort:
        // Collections.sort(ArrayList_name) -----------------------------------------------------------------------------------------> sort in ascending order
        Collections.sort(l8);
        System.out.println("l8: "+l8);



        // ArrayList_name.sort(null); -----------------------------------------------------------------------------------------------> sort in ascending order
        l5.sort(null);
        System.out.println("l5: "+l5);

        


        // Comparator is an interface . by using we can do custom ordering.return
        // it contains a method called compare . which compare two object of same type and determine there order.
        // Student h = new Student();
        List<Student> students = new ArrayList<>();

        students.add(new Student("Rahul", 3.5));
        students.add(new Student("Ravi", 3.7));
        students.add(new Student("Raman", 4.9));
        students.add(new Student("Rohit", 3.5));
        // students.sort(null);
        students.sort((a, b) -> (int)(a.getGpa() - b.getGpa()));
        for (Student h : students) {
            System.out.println(h.getName() + ": "+ h.getGpa());
        }


        // Collections.sort(ArrayList_name,Comparator_name)
        List<Integer> l9 = new ArrayList<>();
        l9.add(10);
        l9.add(2);
        l9.add(300);
        l9.add(14);
        l9.add(50);
        l9.add(6);
        // Without using lambda expression. and using comparator
        // Collections.sort(ArrayList_name, new Comparator<Value_type>(){});
        Collections.sort(l9, new Comparator<Integer>() {
            @Override                                                                                     // Ascending order : "return obj1 - obj2" . Similarly Decending order : "return obj2 - obj1"
            public int compare(Integer o1, Integer o2) {                                                  // if return value is negative "o1" comes first then "o2". [ie.  -ve = same order]
                return o1-o2;                                                                             // if return value is positive "02" comes first then "o1". [ie,  +ve = opp order]
            }
            // Ascending order.
            // (o1,o2)
            // (5, 3) {return 5-3} -----------------------------------------------------------------------> returns positive . hence order is : 3, 5
            // (3, 5) {return 3-5} -----------------------------------------------------------------------> returns negative . hence order is : 3, 5
            // Decending order.
            // (5, 3) {return 3-5} -----------------------------------------------------------------------> returns negative . hence order is : 5, 3
            // (3, 5) {return 5-3} -----------------------------------------------------------------------> returns positive . hence order is : 5, 3
        });
        System.out.println("l9 Ascending order: "+l9);


        // implementing Comparator interface out side the class
        List<String> words = Arrays.asList("banana", "apple", "date");
        // ListName.sort(new static class_name());
        words.sort(new StringLengthComparator());
        System.out.println("length wise: "+words);


    }

    static class StringLengthComparator implements Comparator<String>{
        @Override
        public int compare(String s1, String s2) {
            return s1.length()-s2.length();
        }
        // Ascending order : "return obj1 - obj2" . Similarly Decending order : "return obj2 - obj1"
        // if return value is negative "o1" comes first then "o2". [ie.  -ve = same order]
        // if return value is positive "02" comes first then "o1". [ie,  +ve = opp order]
        // o1         o2
        // "ok"      "bye"
        // len1=2     len2=3
    }



    class Student {
        private String name;
        private double gpa;
    
        // Constructor
        public Student(String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        public double getGpa() {
            return gpa;
        }
        @Override
        public String toString() {
            return "Student{name='" + name + "', gpa=" + gpa + "}";
        }
  
    }
}