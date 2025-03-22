package PracticedPrograms;

import java.util.Scanner;

public class ArrayTwo {
    public static void main(String[] args) {
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



}
