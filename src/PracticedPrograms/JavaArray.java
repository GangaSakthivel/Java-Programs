package PracticedPrograms;

import java.util.Scanner;

public class JavaArray {
    public static void main(String[] args) {
        String[] cars = new String[8];
        cars[0] = "Toyota";
        cars[1] = "Honda";
        cars[2] = "Ford";
        cars[3] = "Chevrolet";
        cars[4] = "BMW";
        cars[5] = "Mercedes";
        cars[6] = "Audi";
        cars[7] = "Nissan";
        System.out.println(cars.length);
        System.out.println(cars[0]);
        System.out.println(cars[5]);

        //syntax
       // datatype[] variable (reference) = new(keyword) datatype[size];
        int[] rollNo = new int[10];
        int[] rollNoTwo = {10, 5, 3, 4, 2};
        int[] names; //declaration of array //here names varibale is getting defined in stack
        names = new int[10]; //initialization
        // this is where actual memory is created in the heap memory

        int[] age = new int[10];
        age[1] = 34;
        System.out.println(age[1]);
        age[0] = 21;
        System.out.println(age[0]);
        age[0] = 23;
        System.out.println(age[0]);
        System.out.println(age.length);

        //type 1 declaration
        int[] marks = new int[10];
        int gcpa[] = new int[10];



        //initializing an array
        String[] namesList = {"Ganga", "Sakthivel", "vino", "Anu", "Mythily", "Shreya"};
        System.out.println(namesList);
        System.out.println(namesList[2] + namesList[3]);
        namesList[2] = "Vikash";
        System.out.println(namesList[2]);
        System.out.println(namesList.length);
        for(int i = 0; i < namesList.length; i++){
            System.out.println(namesList[i]);
        }
        //for loop
       int[] numbers = {10, 20, 30, 40, 50};
        int sumCount = 0;
        for(int i = 0; i < numbers.length;i++){
            sumCount+=numbers[i];

        }
        System.out.println(sumCount);

        //for each loop
        int sum = 0;
        for(int num: numbers){
            sum+=num;
        }
        System.out.println("sum of array elements:" + sum);

        //int[] //numbers = {10, 20, 30, 40, 50};
        int max = numbers[0];
        for(int num: numbers){
            if(num > max){
                max = num;
            }
        }
        System.out.println("Maximum element: " + max);



    }
}
