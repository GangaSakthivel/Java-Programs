package basicPrograms;
import java.lang.System;
import java.util.Scanner;


public class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello World");
//        int age = 23; //integer
//        double price = 99.99;
//        char grade = 'A';
//        String name = "Ganga";

//        System.out.println("Age:" + age);
//        System.out.println("Price: " + price);
//        System.out.println("Grade: " + grade);
//        System.out.println("Name: " + name);

//        String name = "John";
//        int age = 30;
//        double salary = 50000.0;
//        char Grade = 'A';
//        boolean Employed = true;
//
//        System.out.println("Name: " + name);
//        System.out.println("Name: " + age);
//        System.out.println("Name: " + salary);
//        System.out.println("Grade: "+ Grade);
//        System.out.println("Name: " + Employed);

//         Scanner sc = new Scanner(System.in);
////        System.out.print("Enter the number: ");
////         int number = sc.nextInt();
////        System.out.println("The number is:" + number);
//        System.out.println("Enter your name: ");
//        String name = sc.nextLine();
//        System.out.println(name);
//        sc.close();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.print("Enter your age:");
        int age = sc.nextInt();

        System.out.print("Enter your address:");
        String address = sc.nextLine();
        System.out.println(address);
        System.out.print("name: " + name + "Age" + age + "Address: " + address);





    }
}
