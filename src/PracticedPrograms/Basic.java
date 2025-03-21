package PracticedPrograms;

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if(i == 3){
            break;
        }
            System.out.print("Enter the number: ");
            int value = sc.nextInt();
            System.out.println("You entered: " + value);
    }
    }
}









