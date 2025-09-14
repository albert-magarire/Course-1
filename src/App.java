// Specifies the package name
import java.util.Scanner; // Imports the Scanner class for user input
public class App {
     // Defines a public class named App
    public static void main(String[] args) throws Exception { // Main method, entry point of the program
        Scanner word_input = new Scanner(System.in); // Creates a Scanner object to read input from the console
        System.out.println("Enter a word: ");
        String user_word = word_input.nextLine();
        if (user_word.length() < 5){
            System.out.println("Word is too short, buddy!");
        }else if ("hello".equals(user_word)){
            System.out.println("Hi there!");
        }else{
            System.out.println("Buddy, your word is: " + user_word);
        }
        //repo:albert-magarire/Course-1 /just typing in somthing for a commit
    }
}
