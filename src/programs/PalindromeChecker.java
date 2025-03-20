package programs;

import PracticedPrograms.Basic;

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

        public static void maxOfTwo(){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the numbers: ");
            int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
            int maxNumber = Math.max(a, Math.max(b, c));
            System.out.println(maxNumber);

}

    public static void OddEven(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        switch (number % 2){
            case 0:
                System.out.println("Even. ");
                break;
            case 1:
                System.out.println("Odd");
                break;
            default:
                System.out.println("Invalid input.");

        }
    }

    public static void main(String[] args) {
        //isPalindrome();
        //controlFlowWitch();
        //ATMpinverification();
        //maxOfTwo();
        OddEven();




    }
}


//    int x = 10;
//    static int y = 20;
//    public void number(){
//        System.out.println(x);
//    }
//
//    public static void two(){
//        System.out.println(y);
//        //System.out.println(x);
//    }
//
//
//
//    public static void main(String[] args) {
//        Basic obj = new Basic();
//        obj.number();
//        System.out.println(obj.x);
//        two();
//
//        System.out.println(Basic.y);//static method can be accessed through class name
//
