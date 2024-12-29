// String Methods:
package com.example_010;

public class Main {
    public static void main(String[] args) {
        
        String str = "Param";
        System.out.println(str);

        // name.length()
        System.out.println("name.length()");
        int value = str.length();
        System.out.println("Length of String: " + value);

        // name.toLowerCase()
        System.out.println("name.toLowerCase()");
        String str1 = str.toLowerCase();
        System.out.println(str1);

        // name.toUpperCase()
        System.out.println("name.toUpperCase()");
        String str2 = str.toUpperCase();
        System.out.println(str2);

        // name.trim()
        System.out.println("name.trim()");
        String str3 = "         Hello         ";
        System.out.println(str3);
        String str4 = str3.trim();
        System.out.println(str4);

        // name.substring(string index(included))
        // name.substring(string index(included) , ending index(excluded))
        System.out.println("name.substring(string index(included) , ending index(excluded))");
        String str5 = "Hello World";
        System.out.println(str5.substring(3));
        System.out.println(str5.substring(3,  9));

        // name.replace('oldChar', 'newChar')
        // name.replace("oldString", "newString")
        System.out.println("name.replace('oldChar', 'newChar')");
        String str6 = "Harry";
        System.out.println(str6.replace('r', 'p'));
        System.out.println(str6.replace("rry", "ier"));
        System.out.println(str6.replace("rr", "ier"));
        System.out.println(str6.replace("r", "ier"));
        System.out.println(str6.replace("Harry", "Rohan"));

        // name.startsWith("string")
        System.out.println("name.startsWith(string)");                                              // returns true or false
        System.out.println(str6.startsWith("Ha"));
        System.out.println(str6.startsWith("ha"));

        // name.endsWith("string)
        System.out.println("name.endsWith(string)");                                                // returns true or false
        System.out.println(str6.endsWith("rry"));
        System.out.println(str6.endsWith("y"));
        System.out.println(str6.endsWith("Har"));

        // name.charAt(index)
        System.out.println("name.charAt(index)");                                                   // return a single character
        System.out.println(str6.charAt(0));
        System.out.println(str6.charAt(1));
        System.out.println(str6.charAt(2));
        System.out.println(str6.charAt(3));
        System.out.println(str6.charAt(4));

        // name.indexOf(search_string)
        // name.indexOf(search_string, from_Index)
        System.out.println("name.indexOf(search_string, from_index)");                              // return the index value
        String str7 = "harryrry";
        System.out.println(str7.indexOf("ry"));
        System.out.println(str7.indexOf('a'));
        System.out.println(str7.indexOf("r"));
        System.out.println(str7.indexOf("r", 4));
        System.out.println(str7.indexOf("y", 5));
        System.out.println(str7.indexOf("xyz"));                                                    // returns "-1 " if string not found
        
        // name.lastIndexOf(search_string)
        // name.lastIndexOf(search_string,  from_Index)
        System.out.println("name.lastIndexOf(search_string, from_index)");                          // return index value from back side
        System.out.println(str7.lastIndexOf("ry"));
        System.out.println(str7.lastIndexOf("y"));
        System.out.println(str7.lastIndexOf("r", 4));
        System.out.println(str7.indexOf("xyz"));                                                    // returns "-1 " if string not found

        // name.equals("string")
        System.out.println("name.equals(string)");                                                   // returns true or false
        System.out.println(str7.equals("Harry"));
        System.out.println(str6.equals("Harry"));
        System.out.println(str6.equals("harry"));
        
        // name.equalsIgnoreCase("string")
        System.out.println("name.equalsIgnoreCase(string)");
        System.out.println(str6.equalsIgnoreCase("harry"));
        System.out.println(str6.equalsIgnoreCase("hARrY"));

        // Escape Sequence Characters: consist of more than one character but represent one character when used in string
        System.out.println("Escape Sequenece Character");
        System.out.println("Hello \n World");
        System.out.println("Hello \t World");
        System.out.println("Hello \\ World");
        System.out.println("Apple\'s");
        System.out.println("Mangoes\"s");

        // Strings are immutable . Hence original string will never change
        System.out.println("Strings are immutable");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
    }
}