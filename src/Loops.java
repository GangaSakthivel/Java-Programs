public class Loops {
    public static void main(String[] args) {
//        int i = 50;
//        while(i >= 40){
//            System.out.println(i);
//            i--;
//        }


        //equals() only works with object
//        int a = 5;
//        int b = 5;
//        System.out.println(a == b);

//        String s1 = "Ganga";
//        String s2 = "Ganga";
//        String s3 = new String("Ganga");

//        for(int i = 1; i <= 5; i++){
//            if(i == 3){
//                continue;
//            }
//            System.out.println(i);
//        }

        //Write a Java program that prints numbers from 1 to 10, but skip 5 and stop when you reach 8.
        for (int i = 1; i <= 10; i++){
            if(i == 5){
                continue;
            } else if (i == 8) {
                break;

            }
            System.out.println(i);
        }
        
    }
}
