package PracticedPrograms;


import java.util.Scanner;

public class ExamplePrograms {
    public static void practiceOne(){
        // 📌 Task Details:
//        1️⃣ Ask the user how many items they want to buy.
//        2️⃣ Use a for loop to get price and quantity for each item.
//        3️⃣ Calculate the total bill based on price × quantity.
//        4️⃣ If the total bill is above ₹5000, apply a 10% discount.
//        5️⃣ Display the final amount after discount (if applicable).
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Items: ");//quantity
        int items = sc.nextInt();
        double totalBill = 0;
        for(int i = 1; i <= items; i++){
            System.out.print("Enter price of the item " + i + ":");
            int price = sc.nextInt();
            System.out.print("Enter quantity of item " + i + ":");
            int quantity = sc.nextInt();

            totalBill+=(price * quantity);
        }

        if(totalBill > 5000){
            double discount = totalBill * 0.10;
            totalBill-=discount;
            System.out.println("Discount applied: " + totalBill);

        }
        System.out.println("Final bill after discount:" + totalBill);
    }

    public static void main(String[] args) {
        practiceOne();

    }
}


