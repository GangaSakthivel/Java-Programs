package programs;

import java.util.Scanner;

public class PalindromeChecker {

    public static void isPalindrome(){
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

    public static void controlFlowWitch(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int value = sc.nextInt();
        switch (value){
            case 1:
                System.out.print("Its monday. ");
                break;
            case 2:
                System.out.println("Its tuesday. ");
                break;
            case 3:
                System.out.println("Its wednesday. ");
                break;
            case 4:
                System.out.println("Thursday. ");
                break;
            case 5:
                System.out.println("Friday.");
                break;
            default:
                System.out.println("Enter a day.");
        }
    }


    public static void ATMpinverification(){
        Scanner scanner = new Scanner(System.in);
        final int correctPin = 1234; // Predefined correct PIN
        int attempts = 0;
        int userPin;

        do {
            System.out.print("Enter your 4-digit PIN: ");
            userPin = scanner.nextInt();
            attempts++;

            if (userPin == correctPin) {
                System.out.println("Access Granted!");
                break;
            } else {
                System.out.println("Incorrect PIN. Try again.");
            }
        } while (attempts < 3);

        if (userPin != correctPin) {
            System.out.println("Too many failed attempts. Account locked.");
        }


}

    public static void main(String[] args) {
        //isPalindrome();
        //controlFlowWitch();
        ATMpinverification();


    }
}