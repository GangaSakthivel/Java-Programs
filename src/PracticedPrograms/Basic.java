package PracticedPrograms;

import java.util.Scanner;

public class Basic {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter input");
                String input = sc.nextLine();
                StringBuilder sb = new StringBuilder(input);
                sb.reverse();
                System.out.println(sb);

                String name = "programming";
                for(int i = 0; i < name.length(); i++){
                        System.out.println(name.charAt(i));
                }



        }

}



