package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        double radius;
        double A;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        if(radius >= 0){
            A = Circle.getArea(radius);
            System.out.println("The area of a circle of radius  " + radius + " is " + A);
        }else{
            System.out.println("Please enter a positive number! ");
        }

//        A = Circle.getArea(radius);
//        System.out.println("The area of a circle of radius " + radius + " is " + A);
    }
}
