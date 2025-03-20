package PracticedPrograms;
import java.lang.*;
import java.util.Scanner;

public class StringBuilderJava {


    public static void main(String[] args) {
        StringBuilder sbTwo = new StringBuilder();
        sbTwo.append("Java");
        System.out.println(sbTwo);//if string is empty we can use append to assign a value for that

        StringBuilder sb = new StringBuilder("Language ");
        System.out.println(sb);
        // 1. Append a string to the StringBuilder
        sb.append("is Java");
        System.out.println(sb);
        // 2. Insert a substring at a specific position
        sb.insert(16, " Oops language");
        System.out.println(sb);

        sb.replace(0, 9, "object ");
        System.out.println(sb);

        sb.delete(2, 3);
        System.out.println(sb);

        System.out.println(sb.length());

        sb.deleteCharAt(3);
        System.out.println(sb);

        //Convert the StringBuilder to a String
        String result = sb.toString();
        System.out.println(result);

        //StringBuilder sb = new StringBuilder("abcdef"); //abcdef 01C345
        sb.delete(2, 4);
        System.out.println(sb);

        //Start at index 2 → 'c' ✅ (will be removed)
        //Remove characters until index 4 (but not including index 4)
        //End at index 3 → 'd' ✅ (will be removed)
        //Index 4 ('e') remains ❌ (NOT removed)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        String input = sc.nextLine();
        StringBuilder sbs = new StringBuilder(input);
        sb.reverse();
        System.out.println(sbs);

        String name = "programming";
        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }



    }
}
