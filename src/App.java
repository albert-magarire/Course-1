public class App { // Defines a public class named App
    public static void main(String[] args) throws Exception { // Main method, entry point of the program
        System.out.println("Hello, World!"); // Prints "Hello, World!" with a newline
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
        
    }
}
