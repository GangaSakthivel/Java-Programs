package programs;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i <= 10; i++){
            if(i % 2 != 0){
                count++;
            }
        }
        System.out.println(count);
}
}
