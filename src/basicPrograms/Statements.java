package basicPrograms;
import java.util.Scanner;

public class Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //if

//        System.out.println("Enter the age: ");
//        int age = sc.nextInt();
//        if(age >= 18){
//            System.out.println("eligible to vote");
//
//        }
//        else {
//            System.out.println("not eligible to vote");
//        }

//        if(false){
//            System.out.println("Eligible");
//        }
//        else {
//            System.out.println("Not eligible");
//        }

//        boolean rain = true;
//        if(!rain){
//            System.out.println("It is raining");
//        }


//        System.out.print("enter the marks:");
//        int marks = sc.nextInt();
//        if(marks >= 90){
//            System.out.println("Grade: A");
//        } else if (marks >= 70) {
//            System.out.println("Grade: B");
//
//        } else if (marks >= 50) {
//            System.out.println("Grade: C");
//
//        } else if (marks >= 30) {
//            System.out.println("Grade: D");
//
//        }else {
//            System.out.println("Fail");
//        }

//        for(int i = 1; i <= 5; i++){
//            System.out.println(i);
//        }

//        for(int i = 2; i <= 10; i+=2){
//            System.out.println(i);
//        }


//        for(int i = 10; i >= 1; i-=1){
//            System.out.println(i);
//       }



        for (int i = 0; i < 5; i++) {
            System.out.println("Ganga");
        }
    }

    public static class Exercises {

        public static void one(){
            //Write a Java program that prints numbers from 1 to 10, but skip 5 and stop when you reach 8.
            for(int i = 1; i <= 10; i++){
                if(i == 5){
                    continue;
                } else if (i == 8) {
                    break;

                }
                System.out.println(i);

            }
        }

        public static void two(){
    //        Write a Java program to print numbers from 1 to 20, but:
    //
    //        Skip multiples of 3.
    //        Stop the loop when you reach 15.

            for(int i = 1; i <= 20; i++){
                if(i % 3 == 0){
                    continue;
                } else if (i == 15) {
                    break;

                }
                System.out.println(i);
            }
        }

    //    Write a Java program to print numbers from 1 to 50, but:
    //
    //            ✅ Skip numbers that are divisible by 2 and 5 (both)
    //            ✅ Stop the loop when you reach 45

        public static void three(){
            for(int i = 1; i <= 50; i++){
                if(i % 2 == 0 || i % 5 ==0){
                    continue;
                } else if (i > 45) {
                    break;

                }
                System.out.println(i);
            }
        }

    //    Write a Java program to:
    //
    //            ✅ Print numbers from 1 to 20
    //            ✅ Skip numbers that are either odd or divisible by 4

        public static void four(){
            for(int i = 1; i <= 20; i++){
                if(i % 2 != 0 || i % 4 == 0) {
                    continue;
                }
                System.out.println(i);
            }
        }



        public static void main(String[] args) {
            //one();
            //two();
            //three();
            four();

        }
    }

    public static class Loops {
        public static void main(String[] args) {
    //        int i = 50;
    //        while(i >= 40){
    //            System.out.println(i);
    //            i--;
    //        }


            //equals() only works with object
    //        int a = 5;
    //        int b = 5;
    //        System.out.println(a == b);

    //        String s1 = "Ganga";
    //        String s2 = "Ganga";
    //        String s3 = new String("Ganga");

    //        for(int i = 1; i <= 5; i++){
    //            if(i == 3){
    //                continue;
    //            }
    //            System.out.println(i);
    //        }

            //Write a Java program that prints numbers from 1 to 10, but skip 5 and stop when you reach 8.
            for (int i = 1; i <= 10; i++){
                if(i == 5){
                    continue;
                } else if (i == 8) {
                    break;

                }
                System.out.println(i);
            }

        }
    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
        }
    }

    public static class Methods {
        //Method definition
        public void greet(){
            System.out.println("Hello");
        }


        //method calling
        public static void main(String[] args) {
            Methods m = new Methods();
            m.greet();

        }


    }
}
