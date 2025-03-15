package basicPrograms;


import java.util.Scanner;

public class OopsPractice {

    public static int add(int x, int y) {  // Different names, but same logic
        return x + y;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOne = sc.nextInt();
        int numTwo = sc.nextInt();
        int result = add(numOne, numTwo);
        System.out.println(result);



    }


}
