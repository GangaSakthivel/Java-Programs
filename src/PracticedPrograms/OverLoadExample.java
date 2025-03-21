package PracticedPrograms;



public class OverLoadExample {
    public static int calculate(int num1, int num2){
        return  num1 + num2;
    }

    public static double calculate(double a, double b, double c){
        return  a + b + c;
    }

    public static void calcualate(String str, int times){
        for (int i = 0; i < times; i ++){
            System.out.print(str + " ");

        }
        System.out.println();
    }


    public static void main(String[] args) {

        calcualate("Ganga", 2);
        System.out.println(calculate(10, 30));
        System.out.println(calculate(23.4, 43.5, 23.5));

    }

}
