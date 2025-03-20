package PracticedPrograms;

//java constructor

public class Student {

    int number;
//    int marks; //default 0
//    String name;// default null

//    Student(){
//        System.out.println("Hello there! ");
//    }
//
//    Student(String n){
//        name = n;
//        System.out.println("The name is " + n);
//
//    }

    //Default Constructor: A constructor with no parameters.
    Student(){
        System.out.println("This is a default constructor. ");
    }


    Student(int n){
        number = n;
        System.out.println("The number entered is: " + n);

    }

    public static void main(String[] args) {
       Student s1 = new Student();
       Student s3 = new Student(10);
//        Student s2 = new Student("Ganga");





    }
}




//A constructor is a special method in Java that is used to initialize objects.
// It has the same name as the class and does not have a return type.

//How does a constructor differ from a method?

//A constructor is called automatically when an object is created, whereas a method needs to be explicitly called.
//A constructor does not have a return type, while methods can return values.
//The name of a constructor must match the class name, but methods can have any name.

/*Can a constructor return a value? Why or why not?
No, a constructor cannot have a return type (not even void).
The purpose of a constructor is to initialize an object, not return values.
 */