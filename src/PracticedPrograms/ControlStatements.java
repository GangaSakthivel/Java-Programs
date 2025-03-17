package PracticedPrograms;

public class ControlStatements {
    public static void main(String[] args) {
        //Write a program to print numbers from 1 to 10, but stop the loop when the number is 5.
        for(int i = 1; i <= 10; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
    }

        //Print numbers from 1 to 10, but skip the number 5.
        for(int j = 1; j <= 10; j++){
            if(j==5){
                continue;
            }
            System.out.println(j);
        }


        //Print numbers from 1 to 20, but:
        //Skip numbers that are divisible by 3
        //Stop the loop when the number is 15

        for (int i = 1; i <= 20; i++) {
            if (i == 15) {
                break; // Stops when i = 15
            }
            if (i % 3 == 0) {
                continue; // Skips numbers divisible by 3
            }
            System.out.println(i);
        }


        // (Print Only Even Numbers Using continue)
        for(int i = 1; i <= 50; i++){
            if(i % 2 == 0){
                System.out.println(i);
                continue;//skips odd numbers

            }


        }

    }
}
