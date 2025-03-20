package PracticedPrograms;

public class StringsInJava {
    //19-03-2025
    public static void main(String[] args) {
        String name = "Ganga";
        String str = new String("Ganga Sakthivel");
        System.out.println(str);
        str = "Sakthivel"; //new object can be created but cannot be changed since it is immutable
        System.out.println(str);

        String strTwo = " Language ";
        System.out.println(strTwo.length()); //check the string length
        System.out.println(strTwo.charAt(4)); //checks the index of the particular character
        System.out.println(strTwo.toLowerCase());//Converts to lowercase
        System.out.println(strTwo.toUpperCase());//Converts to uppercase
        System.out.println(strTwo.trim());
        System.out.println(strTwo.substring(2, 5));//Extracts part of a string
        System.out.println(strTwo.contains("gu"));  //Checks if a string contains another
        System.out.println(strTwo.indexOf("g"));//Finds the position of a substring
        System.out.println(strTwo.replace("L", "l"));

        //Concatenation in Strings using + and using concat method/function
        String one = "Ganga";
        String two = "Ganga";
        String newStr = one +" "+ two;
        System.out.println(newStr);

        System.out.println(one.concat(two));


        //using equals() to compare the content inside the variable

        String first = "Java";   // Stored in String Pool
        String second = "java";  // Stored in String Pool
        String three = "java";   // Reuses the "java" string from the String Pool

        System.out.println(first.equals(three)); // Java and java are different
        System.out.println(second.equals(three));

        System.out.println(second == three); // java and java reference the same
        System.out.println(first == second);

        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1 == s2); // false (different objects)

        String s3 = "Malicious";
        String reversed = new StringBuilder(s3).reverse().toString();
        System.out.println(reversed);
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
