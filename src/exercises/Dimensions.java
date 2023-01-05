package exercises;
import java.util.Scanner;

public class Dimensions {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the length of your rectangle: ");
        length = input.nextDouble();


        input = new Scanner(System.in);
        System.out.println("Enter the width of your rectangle: ");
        width = input.nextDouble();


        area = (length) * width;
        System.out.println("The area in your rectangle is: " + area);
    }
}
