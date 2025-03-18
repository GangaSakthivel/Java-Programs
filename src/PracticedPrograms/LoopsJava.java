package PracticedPrograms;

import java.util.Scanner;

public class LoopsJava {

    public static void practiceOne() {
        // The if-else statement allows us to execute one block of code if a condition is true,
        // and another block if the condition is false.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Positive.");
        } else {
            System.out.println("Negative.");
        }
    }


    public static void practice3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the years of experience");
        int year = sc.nextInt();
        System.out.println("Enter the salary");
        double salary = sc.nextDouble();
        double bonus = 0;
        if (year >= 10) {
            bonus = 0.2 * salary; // 20% of salary
        } else if (year >= 5) {
            bonus = 0.1 * salary; // 10% of salary
        } else {
            bonus = 0.05 * salary; // 5% of salary
        }
        System.out.println("Your bonus is: " + bonus);
    }

    public static void main(String[] args) {
        practiceOne();
        practice3();
    }
}
