package PracticedPrograms;

//Constructor

public class Cars {

    //Constructor here
    Cars(){ //default constructor
        System.out.println("This is default constructor. ");
    }

    Cars(String text){
        System.out.println(text);

    }

    Cars(String name, int age){
        System.out.println("My name is: " + name + "My age is: " + age);

    }

    Cars(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public static void main(String[] args) {
        Cars c1 = new Cars();//calling the default constructor
        Cars c2 = new Cars("This the parameterized constructor.");
        Cars c3 = new Cars("Ganga", 23);
        Cars c4 = new Cars(10, 29);
        //If a constructor has parameters, it is called a parameterized constructor, not a default constructor.

    }
}
