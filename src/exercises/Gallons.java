package exercises;
import java.util.Scanner;
public class Gallons {
    public static void main(String[] args) {
        double miles;
        double gallons;
        double mpg;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        miles = input.nextDouble();

        System.out.println("How many gallons did you use? ");
        gallons = input.nextDouble();

        mpg = (miles) / gallons;
        System.out.println("You are running on  " + mpg + " mpg");
    }


}
