/* 
Creating process of "java_001\src\main\java\com\example_001\Main.java" file format
ctrl + shift + P 
Java: Create Java Project
Maven
No Archetype
package_name. example: com.example_001
folder_name. example: java_001
select folder location
"java_001\src\main\java\com\example_001\Main.java". follow this path to find your "Main.java" file
*/
package com.example_001;
// com.example_001 : It is a package. "package" is used to group related classes
public class Main {
    /* 
    Main : It is a class. "class" is a group of function
    example : let Establish a company(class) "HouseRepair". It is a group of "plumber" + "electrician" + "Painter" + "Carpenter" + ....... etc
    */
    public static void main(String[] args) {
        /* 
        public : Access Specifier. It specifies from where and who can access the method.
        static : keyword. 
        It is a keyword that is when associated with a method, making it a class-related method. The main() method is static so that JVM can invoke it without instantiating the class. This also saves the unnecessary wastage of memory which would have been used by the object declared only for calling the main() method by the JVM.
        void : return type
        main() : function or method name
        String[] args : Array of string type
        */
        /* 
        main() : It is a function. "function" is a group of code to perform certain action. we can run that code just by calling the function
        example : let "plumber" is a function. Its task is to fix water Problems. we can "plumber" when ever we want to fix water lickage problem
        */
        System.out.println("Hello world!");
    }
}


/* 
Naming Conventions:
Classes : "PascalConvention". ie, first letter is always Capital.
example: "CodeWithHarry"

functions : "camelCase". ie, first letter is always small.
example: "codeWithHarry"
*/



/*
Anatomy Of a Java Program:
Document Section -------------------------> Suggested (comments)
Package Statement ------------------------> Optional (package_name)
Import Statement -------------------------> Optional (scanner class)
Interface Statement ----------------------> Optional
Class Definations ------------------------> Optional (You can create your custom classes and use them inside your program)

Main Method Class{
    Main Method Defination 
}                -------------------------> Mandatory (main method & it's Class. Since it is the entry point of java program)
 */