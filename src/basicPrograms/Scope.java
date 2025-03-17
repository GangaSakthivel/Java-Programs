package basicPrograms;

public class Scope {

    int num = 20;

    public void display(){
        System.out.println(this.num);

    }

    public static void main(String[] args) {
        Scope sc = new Scope();
        sc.display();


    }
}
