package basicPrograms;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
//
//        String name = sc.nextLine();
//        int age = sc.nextInt();
//        System.out.print("My name is " + name + "\n" + "My age is " + age);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a * b * c;
        int e = a + b + c;
        System.out.println(d/e);


    }



}
