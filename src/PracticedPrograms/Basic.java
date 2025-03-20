package PracticedPrograms;

import java.util.Scanner;

public class Basic {
        public static void main(String[] args) {
              String name = "ganga";
              String nameTwo = "Ganga";
                System.out.println(name == nameTwo);

                String str1 = new String("Ganga");
                String str2 = new String("Ganga");
                System.out.println(str1.equals(str2));

                String str3 = new String("Ganga").intern();
                System.out.println(nameTwo == str3);
                


        }

}



