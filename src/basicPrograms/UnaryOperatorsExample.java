package basicPrograms;

public class UnaryOperatorsExample {
    public static void main(String[] args) {
        // Unary plus and minus
        int a = 10;
        System.out.println(+a); //output 10
        System.out.println(-a); //output -10

        // Increment Operators
        int b = 5;
        System.out.println("Pre increment: " + ++b); // Increments first, then prints (6)
        System.out.println("Post increment: " + b++); // Prints first (6), then increments
        System.out.println("After post increment: " + b); // Now b is 7








        // Logical NOT
        boolean flag = true;
        boolean flagTwo = false;
        System.out.println(!flag);
        System.out.println(!flagTwo);

        //bitwise complement
        int d = 5;
        System.out.println(~d);

//        The increment operator increases a variable's value by 1. There are two types:
//
//        Pre-Increment (++x)
//        Increments first, then returns the updated value.

        int number = 10;
        System.out.println("Pre increment: " + ++number);

//        Post-Increment (x++)
//        Returns the current value first, then increments.

        int numberTwo = 10;
        System.out.println("Post increment: " + numberTwo++); // prints 10(current value ) then returns 11
        System.out.println("Post increment: " +  numberTwo); //returns 11

        int numOne = 5;
        System.out.println("Pre decrement: " + --numOne); // returns 4 (current value then decrements)
        System.out.println("Post decrement: " + numOne--);// returns current value
        System.out.println("Post decrement: " + numOne); // then decrements


        int x = 3;

        System.out.println(x++);  // 3
        System.out.println(++x);  // 4
        System.out.println(x);    // 4


        int y =  7;
        System.out.println(y++);
        System.out.println(++y);
        System.out.println(y);

        int z = 5;

        System.out.println(z++); //
        System.out.println(z++); //7
        System.out.println(++z); //6
        System.out.println(z);   //7


    }

}
