/* 
MAP:
- Uses key, value pairs to store data
- can't contain duplicate keys
- can have null keys and null values
- that means it can have atmost only one null key and multiple null values
- can not store primitives
- it also has implementations that keep the order of elements(linkedMap)
*/
package collections_01;
// importing HashMap
import java.util.HashMap;
// importing Map 
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        // creating a HashMap using Map Interface
        Map<String, String> capital = new HashMap<>();
        capital.put("France", "Paris");
        capital.put("Germany", "Berlin");
        capital.put("Belgium", "Brussels");
        capital.put("USA", "Washington");
        capital.put("USA", "New York"); // duplicate key : when key is entered twice or more the last updated value will will be assign to key
        capital.put(null, "Tokyo"); // null key
        capital.put("Japan", null); // null value
        capital.put("Japan", null); // duplicate null value
        capital.put("Japan", "Tokyo"); // overwrite null value
        capital.put("Japan", "Tokyo"); // overwrite existing value
        System.out.println(capital);  // Since, Duplicate key is not allowed this will only print the key, value pairs with unique keys

        // obj.get(key) ----------------------> returns value of that particular key
        System.out.println(capital.get("France"));
        // obj.remove(key) --------------------> delete the value of that key and mark as "null"
        capital.remove("France");
        System.out.println(capital.get("France"));
        System.out.println(capital);


        // obj.containsKey(key) ----------------> returns true if key is present in map otherwise false
        System.out.println(capital.containsKey("Washington"));        // returns false because key=>"USA" has be already initialize with "New York"

        // obj.containsValue(value) ------------> returns true if value is present in map otherwise false
        System.out.println(capital.containsValue("Tokyo")); // returns true

        System.out.println(capital.get(null));

        // obj.replace(key, New_value);
        // obj.replace(key, old_value, New_value);
        capital.replace("Japan", "hollow");
        System.out.println(capital.get("Japan"));

        String UserInput;
        System.out.println("Enter a key to get the value");
        UserInput = sc.next();
        // obj.putIfAbsent(Key,Value) ---------------> check if key exist , its value will be updated , if not exist then new key, value pairs will be added
        capital.putIfAbsent(UserInput, "Delhi");
        System.out.println(capital.get(UserInput));
        System.out.println();


        // print all the key values
        // obj.keySet() ------------------------------> will return an array containing only keys. later on we can iterate on that arary using "for-each loop"
        System.out.println(capital.keySet());
        for(String i: capital.keySet()){
            System.out.println(i);
        }
        System.out.println();


        // print all the values
        // obj.values() ------------------------------> will return an array containing only values.  later on we can iterate on that arary using "for-each loop"
        for(String i: capital.values()){
            System.out.println(i);
        }


        // obj.clear() -------------------------------> this will delete all the keys,value pairs inside hash map
        capital.clear();
        System.out.println(capital);
    }
}