package com.itschool;

// data classes
public class Location {
    private int peopleCount;
    private boolean canGetSnowballs;
    private String name;
    private int[] locationIndexes;

    public Location(
            String name,
            int peopleCount,
            boolean canGetSnowballs,
            int[] locationIndexes) {
        this.peopleCount = peopleCount;
        this.canGetSnowballs = canGetSnowballs;
        this.name = name;
        this.locationIndexes = locationIndexes;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public boolean isCanGetSnowballs() {
        return canGetSnowballs;
    }

    public String getName() {
        return name;
    }

    public int[] getLocationIndexes() {
        return locationIndexes;
    }
}
