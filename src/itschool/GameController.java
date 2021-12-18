package itschool;

public class GameController {

    private Person person;
    private Locations locations;

    public GameController() {
        person = new Person();
        locations = new Locations();
    }

    public void start() {
        while(true) {
            Location[] currentLocations = locations.getCurrent();

            int counter = 1;
            for(Location location : currentLocations) {
                System.out.println(counter + ". " + location.getName());
            }

            System.out.println("Выберите действие:");
            System.out.println("1. Идити <номер локации>.");
            System.out.println("2. Набрать снежков.");
            System.out.println("3. Кинуть снежок.");
            System.out.println("4. Покинуть игру.");
        }
    }
}
