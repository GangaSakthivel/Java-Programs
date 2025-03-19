package PracticedPrograms;

public class TypeConversion {


    public static void main(String[] args) {
       //👉 Write a Java program that assigns an int value to a double variable and prints the result.
        int a = 10;
        double b = a;
        System.out.println(b);

        //👉 Write a Java program that converts a double to an int using explicit type casting and prints both values.
        double number = 34.576;
        int numberTwo = (int) number;
        System.out.println(numberTwo);

        //👉 Write a Java program that takes a character, converts it to its ASCII value, and prints the result.
        char ch = 'B';
        int asciivalue = ch;
        System.out.println(asciivalue);

        int num = 10;
        char numch = (char) num;
        System.out.println(num);

    }

}
