package PracticedPrograms;

import java.util.Scanner;

public class JavaLoops {

    public static void whileLoop(){
        int i = 1;
        while (i <= 5){
            System.out.println(i);
            i++;
        }
    }

    public static void whileLoopOne(){
        //Sum of First N Natural Numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= number){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }

    public static void whileLoopTwo(){
        //Write a Java program using a while loop to print all even numbers from 1 to 20.
        int i = 2;
        while(i <= 20) // A while loop repeatedly executes a block of code as long
            // as the condition inside the parentheses () is true.
            {
            System.out.print(i + " ");
            i+=2;
        }

    }

    public static void forLoop(){
        Scanner sc = new Scanner(System.in);
        System.out.print("entert the number: ");
        int number = sc.nextInt();
        for(int i = 1; i<= number; i++){
            System.out.println(i);
        }
    }

    public static void doWhie(){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= 10);
    }

    public static void doWhileTwo(){
        int i = 4;
        do{
            System.out.println("4 x" + i + " = " + i);
            i+=4;
        }while (i <= 40);
    }

    public static void doWhileThree(){
        Scanner sc = new Scanner(System.in);
        int number;

        do{
            System.out.print("Enter a number greater than 0 (or enter 0 to stop): ");
            number = sc.nextInt();
            if(number > 0){
                System.out.println("You entered. ");
            }else if (number < 0){
                System.out.println("Try again");

            }
        }while(number < 0);

            System.out.println("Exit");
    }

    public static void main(String[] args) {
        //whileLoop();
        //whileLoopOne();
        //whileLoopTwo();
        //forLoop();
        //doWhie();
        //doWhileTwo();
        doWhileThree();
    }
}
