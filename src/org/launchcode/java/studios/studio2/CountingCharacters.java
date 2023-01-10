package org.launchcode.java.studios.studio2;

import java.util.HashMap;
import java.util.Scanner;
public class CountingCharacters {
    public static void main(String[] arg) {
//        String str = "If the product of two terms is zero then common " +
//                "sense says at least one of the two terms has to be zero to start with. " +
//                "So if you move all the terms over to one side, you can put the quadratics into " +
//                "a form that can be factored allowing that side of the equation to equal zero. " +
//                "Once you’ve done that, it’s pretty straightforward from there.";
         Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String str = input.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        HashMap<Character, Integer> charCount = new HashMap<>();
        for(char c: str.toCharArray()){
            charCount.merge(c, 1, Integer :: sum);
        }
        System.out.println(charCount);
    }
}