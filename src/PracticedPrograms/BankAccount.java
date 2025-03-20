package PracticedPrograms;

//Constructor

public class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;

    }

    void displayDetails(){
        System.out.println("Accoung Number: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("------------------------------------------");

    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("AC567890", "Alice Johnson", 7543.25);
        BankAccount b2 = new BankAccount("AC123456", "Robert Smith", 3820.75);
        BankAccount b3 = new BankAccount("AC987654", "Emily Davis", 6254.40);
        BankAccount b4 = new BankAccount("AC456789", "Michael Johnson", 9182.10);
        BankAccount b5 = new BankAccount("AC321654", "Sophia Martinez", 4736.85);
        BankAccount b6 = new BankAccount("AC789012", "David Wilson", 8120.50);
        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
        b4.displayDetails();
        b5.displayDetails();

    }
}
