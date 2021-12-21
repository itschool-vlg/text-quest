package com.itschool;

import java.util.Scanner;

public class GameController {
    private Person person;
    private Locations locations;

    //    _ 0
    //   /
    // 0 -- 0
    //  \
    //   -- 0

    public GameController() {
        person = new Person();
        locations = new Locations(
                new Location[]{
                        new Location("Стартовая локация", 0, true, new int[]{1, 2, 3}),
                        new Location("Двор", 0, true, new int[]{0}),
                        new Location("Улица", 10, false, new int[]{0}),
                        new Location("Снежная гора", 0, true, new int[]{0})
                },
                0
        );
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            Location[] currentLocations = locations.getNextLocations();

            System.out.println("\nТекущая локация: " + locations.getCurrentLocation().getName());
            System.out.println("\nСписок локаций:");

            int counter = 1;
            for(Location location : currentLocations) {
                System.out.println(counter + ". " + location.getName());
                counter++;
            }

            System.out.println();

            System.out.println("Выберите действие:");
            System.out.println("1. Идти <номер локации>.");
//            System.out.println("2. Набрать снежков.");
//            System.out.println("3. Кинуть снежок.");
//            System.out.println("4. Покинуть игру.");

            String input = scanner.nextLine();

            String[] parts = input.split(" ");

            if(!parts[0].equals("1")) {
                System.out.println("Неизвестное действие!");
                continue;
            }

            int locationIndex = Integer.parseInt(parts[1]) - 1;

            locations.nextLocations(currentLocations[locationIndex]);
        }
    }
}
