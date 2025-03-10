
package Midterm;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a word
        System.out.print("Enter a word: ");
        String original = scanner.nextLine();
        
        // Reverse the string
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        // Check if the original word is the same as the reversed word
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is NOT a palindrome.");
        }
        
        scanner.close();
    }
}
