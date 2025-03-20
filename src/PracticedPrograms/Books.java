package PracticedPrograms;

//Constructors

public class Books {

    String title;
    String author;

    // Constructor to initialize Book details
    Books(String title, String author){
            this.title = title;
            this.author = author;

        }
        //Method to display book details
        void display(){
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("------------------------");
        }


    public static void main(String[] args) {
        Books b2 = new Books("It ends with us", "Colleen Hoover");
        Books b1 = new Books("Life's amazing secrets", "Gaur gopal daas");
        Books b3 = new Books("The Night Circus", "Erin Morgenstern");
        b1.display();
        b2.display();
        b3.display();

    }
}
