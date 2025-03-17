package basicPrograms;



public class Workouts {
//    static void myMethod(String name, int age){
//        System.out.println("Fname" + name + " AGe" );
//    }


    public static int add(int numOne, int numbTwo){
        return numOne + numbTwo;
    }

    public static double multiply(float numOne, float numbTwo){
        return numOne * numbTwo;
    }


    public static void display(int num){
        System.out.println("Integet: " + num);
    }

    public static void display(String name){
        System.out.println("String: " + name);
    }

    public static void display(float gcpa){
        System.out.println("Float: " + gcpa);
    }













    public static void main(String[] args) {
//        myMethod("Ganga", 23);

//        System.out.println(add(20, 100));
//        System.out.println(multiply(10, 2));

        display(19);
        display("Ganga");
        display(8.99F);


    }


}
