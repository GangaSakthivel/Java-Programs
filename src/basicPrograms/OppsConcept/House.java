package basicPrograms.OppsConcept;

public class House {
    //Attributes or variable
    int rooms = 5;
    String color;
    String typeOfDoor;


    //methods
    void showDetails(){
        System.out.println("Number of rooms: " + rooms);
        System.out.println("Color of the House: " + color);
        System.out.println("Type of Doors: " + typeOfDoor);
    }



    public static void main(String[] args) {
        House house1 = new House();

        //First House
        house1.rooms = 3;
        house1.color = "Yellow";
        house1.typeOfDoor = "Wooden";

        //Second House
        House house2 = new House();
        house2.rooms = 5;
        house2.color = "Maroon";
        house2.typeOfDoor = "Glass";

        house1.showDetails();
        System.out.println("========================");
        house2.showDetails();

        House obj = new House();
        System.out.println(obj.rooms);


    }
}
