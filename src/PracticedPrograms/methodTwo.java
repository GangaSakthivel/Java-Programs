package PracticedPrograms;

import java.util.Scanner;

public class methodTwo {

    public static void main(String[] args) {
        System.out.println(rectAngle(154, 30));
        System.out.println(findMax(3, 4 , 5));
        System.out.println(isEven(40));
        System.out.println(reverse("ganga"));


    }

    public static int rectAngle(int height, int width){
        return height * width;
    }

    public static int findMax(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();

    }

}
