package com.itschool;

class Person {
    private int snowballsCount = 0;
    private float score = 0;

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    void throw1() {
        if (snowballsCount >= 0) {
            snowballsCount -= 1;
        }

    }

    public int getSnowballsCount() {
        return snowballsCount;
    }

    public void setSnowballsCount(int snowballsCount) {
        this.snowballsCount = snowballsCount;
    }

    // if(s.equals("снежная куча")==true){
    //            snowballsCount=3;
    // }

}
