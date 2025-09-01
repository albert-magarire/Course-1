import java.util.Scanner;
public class Area {

    public static void main(String [] args){
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        double width = user_input.nextDouble();
        System.out.println("Please neter the height of the rectangle: ");
        double height = user_input.nextDouble();
        float area = (float) (width * height); // Calculate the area of the rectangle
        System.out.println("The area of the rectangle is  " + area);
        user_input.close(); // Close the scanner to prevent resource leaks

    }
    
}
