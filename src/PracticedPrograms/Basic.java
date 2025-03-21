package PracticedPrograms;

import java.util.Scanner;

public class Basic {
        public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
            System.out.print("Enter the String to be reversed:");
            String input = sc.nextLine();
            int vowelCount = 0;
            input = input.toLowerCase();
            for(int i = 0; i < input.length(); i++){
                char ch = input.charAt(i);
                if(ch == 'i' || ch == 'o' || ch == 'u' || ch == 'a' || ch == 'e'){
                    vowelCount++;
                }
                System.out.print("Count of vowels: " + vowelCount);

            }
        }

}



