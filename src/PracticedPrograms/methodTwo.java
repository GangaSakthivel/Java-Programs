package PracticedPrograms;

import java.util.Scanner;

public class methodTwo {
    //take input of two numbers and print the sum
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int numberOne = sc.nextInt();
        System.out.print("Enter the number: ");
        int numberTwo = sc.nextInt();
        int sum = numberOne + numberTwo;
        System.out.println(sum);
    }
    static int sumTwo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int numberOne = sc.nextInt();
        System.out.print("Enter the number: ");
        int numberTwo = sc.nextInt();
        int sum = numberOne + numberTwo;
        return sum;

    }

    static int addTwoNum(int a, int b){
        return a + b;

    }

    public static void main(String[] args) {
        sum();
        System.out.println(addTwoNum(14, 12));
        int sum = sumTwo();
        System.out.println(sum);

    }
}
