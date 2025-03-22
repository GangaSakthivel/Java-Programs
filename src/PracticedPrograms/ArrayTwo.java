package PracticedPrograms;

import java.util.Scanner;

public class ArrayTwo {

    public static void programOne(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter the element " + (i + 1) + ":");
            numbers[i] = sc.nextInt();
        }
        for(int num: numbers){
            System.out.println(num);
        }
    }

    public static void minElement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter the element " + (i + 1) + ":");
            numbers[i] = sc.nextInt();
        }
        int min = numbers[0];
        for(int num: numbers){
            if(num < min){
                min = num;
            }

        }
        System.out.println(min);
    }

    public static void EvenOddCount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i < size; i++){
            System.out.print("Enter the element " + (i + 1) + ":");
            numbers[i] = sc.nextInt();
            if(numbers[i] % 2 == 0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.print("Count of even numbers: " + evenCount + "\nCount of odd numbers: " + oddCount);

    }

    public static void pattern(){
        for(int i = 1; i <= 5; i++){
            System.out.print(i);
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void patternTwo(){
        for(int i = 1; i <= 10; i++){
            System.out.print(i);
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void pattern3(){
        for(int i = 1; i <= 5; i++){
            System.out.print("* ");
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
       // programOne();
        //minElement();
        //EvenOddCount();
        //pattern();
        //patternTwo();
        pattern3();



    }
}
