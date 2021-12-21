package com.itschool;

public class Locations {
    // все локации в игре
    private Location[] allLocations;

    // в те которые можем перейти
    private Location[] currentLocations;

    private Location location;

    public Locations(Location[] allLocations, int currentLocationIndex) {
        this.allLocations = allLocations;

        nextLocations(currentLocationIndex);
    }

    public Location getCurrentLocation() {
        return location;
    }

    public Location[] getNextLocations() {
        return currentLocations;
    }

    public void nextLocations(Location location) {
        this.location = location;

        int[] indexes = location.getLocationIndexes();

        setCurrentLocations(indexes);
    }

    public void nextLocations(int locationIndex) {
        this.location = allLocations[locationIndex];

        Location location = allLocations[locationIndex];
        int[] indexes = location.getLocationIndexes();

        setCurrentLocations(indexes);
    }

    private void setCurrentLocations(int[] indexes) {
        Location[] newLocations = new Location[indexes.length];

        for (int i = 0; i < newLocations.length; i++) {
            newLocations[i] = allLocations[indexes[i]];
        }

        currentLocations = newLocations;
    }
}
