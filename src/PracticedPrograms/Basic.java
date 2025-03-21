package PracticedPrograms;

import java.util.Scanner;

public class Basic {

    public static void program1(){ Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int income = sc.nextInt();
        if(income > 7000){
            System.out.println("Eligible for Scholarship");
        }else
        {
            System.out.println("Not eligible. ");
        }
    }

    public static void program2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if(number % 3 == 0 && number % 5 == 0){
            System.out.println("The number is divisible by 3 and 5");
        }else {
            System.out.println("The number is divisible by 3 and 5");
        }
    }

    public static void program3(){
        int num = -7;
        String result = (num > 0) ? "Positive" : (num < 0) ? "Zero" : "Negative";
        System.out.println(result);
    }

    public static void program4(){
        {
         for(int i = 1; i <= 5; i++){
             System.out.println("Ganga");
         }
        }
    }


    public static void main(String[] args) {

        //program1();
        //program2();
        program3();
}


}






