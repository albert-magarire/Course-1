public class App { // Defines a public class named App
    public static void main(String[] args) throws Exception { // Main method, entry point of the program
        /* System.out.println("Hello, World!"); // Prints "Hello, World!" with a newline
        //output styles
        System.out.println("Hi! I am Albert"); // Prints "Hi! I am Albert" with a newline
        System.out.print("Hi! I am Albert"); // Prints "Hi! I am Albert" without a newline
        System.out.print("I am learning Java"); // Prints "I am learning Java" without a newline
        System.out.println("I am learning Java"); // Prints "I am learning Java" with a newline
        System.out.printf("Hi! I am %s and I am %d years old", "Albert", 19); // Prints formatted string with name and age (integer)
        System.out.println(); // Prints a newline
        System.out.printf("Hi! I am %s and I am %.2f years old", "Albert", 19.2567); // Prints formatted string with name and age (float, 2 decimals)

        //printing numbers
        System.out.println(); // Prints a newline
        System.out.println(56); // Prints integer 56 with a newline
        System.out.println(56.67); // Prints floating-point number 56.67 with a newline
        System.out.println(5 + 6); // Prints result of 5 + 6 (addition)
        System.out.println(5 * 6); // Prints result of 5 * 6 (multiplication)
        System.out.println(5 / 6); // Prints result of 5 / 6 (integer division)
        System.out.println(5 - 6); // Prints result of 5 - 6 (subtraction)
        System.out.println(5 + 6 * 2); // Prints result of 6 * 2, then adds 5 (operator precedence)
        System.out.println((5 + 6) * 2); // Prints result of 5 + 6, then multiplies by 2 (parentheses change precedence)
        System.out.println(5 % 2); // Prints remainder of 5 divided by 2 (modulo)
        System.out.println(5 % 3); // Prints remainder of 5 divided by 3 (modulo)
        System.out.println(5 % 4); // Prints remainder of 5 divided by 4 (modulo)
        System.out.println(5 % 5); // Prints remainder of 5 divided by 5 (modulo)
        System.out.println(5 % 6); // Prints remainder of 5 divided by 6 (modulo)

        //commenting styles
        /*
         * This is a multi-line comment.
         * It can span multiple lines.
         * Useful for detailed explanations or documentation.
         */
        // This is a single-line comment. It explains the code on the same line.
        
        /*double age  = 23.001201209f; // Declares an double variable 'age' and initializes it to 23
        System.out.println((float)age); // Prints the value of 'age' cast to a float with a newline
        System.out.println((long)age); // Prints the value of 'age' cast to a long with a newline
        System.out.println((byte)age); // Prints the value of 'age' cast to a byte with a newline
        System.out.println((double)age); // Prints the value of 'age' cast to a float without a newline
        System.out.println();

        //string concatenation
        String firstName = "Albert"; // Declares a String variable 'firstName' and initializes it to "Albert"
        String lastName = "Einstein"; // Declares a String variable 'lastName' and initializes it to "Einstein"
        System.out.println(firstName + " " + lastName); // Prints the concatenation of 'firstName', a space, and 'lastName' with a newline
        System.out.println(firstName + 56); // Prints the concatenation of 'firstName' and integer 56 with a newline
        System.out.println(firstName + 56.67); // Prints the concatenation of 'firstName' and floating-point number 56.67 with a newline
        System.out.println(firstName + (5 + 6)); // Prints the concatenation of 'firstName' and the result of 5 + 6 with a newline
        System.out.println(firstName + 5 + 6); // Prints the concatenation of 'firstName', 5, and 6 with a newline

        //declaring multiple variables
        int x = 5, y = 6, z = 50; // Declares multiple integer variables 'x', 'y', and 'z' and initializes them
        System.out.println(x); // Prints the value of 'x' with a newline
        System.out.println(y); // Prints the value of 'y' with a newline
        System.out.println(z); // Prints the value of 'z' with a newline 

        */

        //multiple variable same value
        int a, b, c; // Declares multiple integer variables 'a', 'b', and 'c'
        a = b = c = 50; // Assigns the value 50 to 'a', 'b', and 'c'
        System.out.println(a + b + c); // Prints the values of integer addition of 'a', 'b', and 'c' with a newline
        System.out.println(a + " " + b + " " + c); // Prints the values of 'a', 'b', and 'c' concatenated with spaces with a newline

    }
}
