public class Exercises {

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
