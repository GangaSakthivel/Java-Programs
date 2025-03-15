package basicPrograms;


import java.util.Scanner;

public class OopsPractice {
    public static void sum(){
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    public static void five(){
        for(int i = 1; i <= 10; i++){
            System.out.println("5x" + i + "=" + i* 5);
        }
    }

    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i; //fact = fact * i
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
        //sum();
        //five();


    }

}
