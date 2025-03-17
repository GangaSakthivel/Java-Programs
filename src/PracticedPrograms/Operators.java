package PracticedPrograms;

import java.util.Scanner;

public class Operators {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //✅ Arithmetic Operators:
        //1️⃣ Add two numbers and print the result.
        //2️⃣ Subtract two numbers and print the result.
        //3️⃣ Multiply two numbers and store the result in a variable.
        //4️⃣ Divide two numbers and find the remainder using the modulus operator.

        System.out.print("Enter the number: ");
        int numberOne = sc.nextInt();
        System.out.print("Enter the number: ");
        int numberTwo = sc.nextInt();
        System.out.println("Addition: " + (numberOne + numberTwo));
        System.out.println("Subtraction: " + (numberOne - numberTwo));
        System.out.println("Multiplication: " + (numberOne * numberTwo));
        System.out.println("Divide: " + numberOne / numberTwo);
        System.out.println("Modulus: " + (numberOne % numberTwo));


        //✅ Relational (Comparison) Operators:
        //5️⃣ Check if two numbers are equal.
        //6️⃣ Check if one number is greater than the other.
        //7️⃣ Verify if two numbers are not equal.
        //8️⃣ Compare two numbers and check if one is less than or equal to the other.

        System.out.println("Equal to: " + (numberOne == numberTwo));
        System.out.println(numberOne >= numberTwo);
        System.out.println(numberOne!= numberTwo);
        System.out.println(numberOne <= numberTwo);

        //✅ Logical Operators:
        //9️⃣ Write a condition to check if a number is between 10 and 20.
        //🔟 Check if a number is positive or divisible by 5.
        //1️⃣1️⃣ Use the NOT operator to reverse a boolean value.

        // Logical Operators
        System.out.println("a > 10 AND b < 20: " + (numberOne > 10 && numberTwo < 20));
        System.out.println("a > 0 OR b > 0: " + (numberOne > 0 || numberTwo > 0));
        System.out.println("NOT (a == b): " + !(numberOne == numberTwo));

        //✅ Assignment Operators:
        //1️⃣2️⃣ Add 10 to a variable using the += operator.
        //1️⃣3️⃣ Subtract 5 from a variable using the -= operator.
        //1️⃣4️⃣ Multiply a variable by 3 using the *= operator.
        //1️⃣5️⃣ Divide a variable by 2 using the /= operator.

        // Assignment Operators
        numberOne += 5; // Adding 5 to 'numberOne'
        System.out.println("a after adding 5: " + numberOne);

        numberTwo *= 2;
        System.out.println("b after multiplying by 2: " + numberTwo);

        //✅ Bitwise Operators:
        //1️⃣6️⃣ Perform the AND operation on two numbers.
        //1️⃣7️⃣ Perform the OR operation on two numbers.
        //1️⃣8️⃣ Perform left shift and right shift on a number.
        //1️⃣9️⃣ Perform the XOR operation between two numbers.


        // Bitwise Operators
        System.out.println("a & b: " + (numberOne & numberTwo)); // AND
        System.out.println("a | b: " + (numberOne | numberTwo)); // OR
        System.out.println("a ^ b: " + (numberOne ^ numberTwo)); // XOR
        System.out.println("Left Shift: " + (numberOne << 2));
        System.out.println("Right Shift: " + (numberOne >> 2));









    }


}
