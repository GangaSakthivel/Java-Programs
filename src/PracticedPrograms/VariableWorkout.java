package PracticedPrograms;

public class VariableWorkout {
    public static void main(String[] args) {
        //Declare a variable city of type String and assign the value "Coimbatore" to it. Print the value of the variable.
        String city = "Coimbatore";
        System.out.println(city);

        //Create two integer variables num1 and num2 with values 10 and 20.
        // Calculate their sum and store it in a new variable result. Print the value of result.
        int num1 = 10;
        int num2 = 20; //int num1 = 10, num2 = 20;
        int sum = num1 + num2;
        System.out.println(sum);

        //Declare a boolean variable isEligible and assign true if age is greater than 18. Use the variable age = 22.
        int age = 22;
        boolean isEligible = age > 18;
        System.out.println(isEligible);

        //Declare a char variable initial and store the first letter of your name in it. Print the variable.
        char intial = 'S';
        System.out.println(intial);

        //Create a double variable temperature and assign a value 36.5. Convert it to an integer and store it in roundedTemp.
        double temperature = 36.5;
        int rounderTemp = (int) temperature;
        System.out.println(rounderTemp);

        //1️⃣ Store your weight (in float).
        float weight = 57.5f;
        //2️⃣ Store your height (in double).
        double height = 154.67;
        //3️⃣ Store your age in byte.
        byte ageTwo = 23;
        //4️⃣ Store your marks in short.
        short marks = 100;
        //5️⃣ Store your mobile number in long.
        long mobileNumber = 1234567891;
        //6️⃣ Print all the values.
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Age: " + ageTwo);
        System.out.println("Marks: " + marks);
        System.out.println("Mobile Number: " + mobileNumber);
    }

}
