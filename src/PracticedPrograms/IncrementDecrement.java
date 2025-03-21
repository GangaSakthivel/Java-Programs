package PracticedPrograms;

import java.util.Scanner;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.println(a++);

        //post decrement
        int x = 5;
        System.out.println(x--);//use the value 5
        System.out.println(x);//the decrements it to 4

        System.out.println(--x);//decrements the value to 3 then uses the value 3

        int num = 10;
        int num2 = num--;
        System.out.println(num2 + num);

        int numTwo = 6;
        System.out.println(--numTwo);

        int z = 100;
        System.out.println(z++);
        System.out.println(z);

        int a = 5;
        System.out.println(a++);
        System.out.println(a);

        int b = 5;
        System.out.println(++b);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();//be it 8
        System.out.println("Uses the value: " + n++);//8
        System.out.println("(then increases the value)Post increment: " + n);//9 n = 9
        System.out.println("Pre decrement: " + ++n);//10
        System.out.println("Uses the value: " + n--);//10
        System.out.println("(Then decreases it) Post Decrement: " + n);//9
        System.out.println("Pre decrement" + --n);//9 the actual value directly decreses it

        int x = 7;

        System.out.println(x--); //7 uses the value then decrements 6
        System.out.println(--x); // 6 actual value 5
        System.out.println(x);   //5
//
        int a = 10;

        System.out.println(--a); // Line 1 //9 a becomes 9
        System.out.println(a--); // Line 2 //9 uses the value and prints (then becomes 8)
        System.out.println(--a); // Line 3 a = 8 then 7
        System.out.println(a);   // Line 4 a = 7



    }
}
