package programs;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String input = sc.nextLine();
        System.out.println("You entered: " + input);
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverse = new StringBuilder(cleanInput).reverse().toString();
        if(cleanInput.equals(reverse)){
            System.out.print("Palindrome.");
        }else
        {
            System.out.print("Not a palindrome.");
        }

    }
}