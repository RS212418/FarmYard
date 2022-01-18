package farmyard;

public class Main {

    public static void main(String[] args) {

        Cow myNewCow = new Cow("Dolly", 5, "Fluffy", "Yesterday");
        Animal myNewAnimal = new Animal("Smarty", 3, "Spotty");
        Sheep myNewSheep = new Sheep("Sheepy", 4,"White", "Two weeks ago");

        System.out.println(myNewCow.toString());
    }
}
