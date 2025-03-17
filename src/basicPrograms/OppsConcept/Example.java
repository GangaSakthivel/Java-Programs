package basicPrograms.OppsConcept;

public class Example {


    public static void main(String[] args) {

        int numbers[] = {10, 20, 30, 40, 50};

        // Accessing Array Elements
        System.out.println(numbers[0]);  // Output: 10
        System.out.println(numbers[3]);  // Output: 40

        // Looping through Array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
