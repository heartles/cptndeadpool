package com.company;

/**
 * Created by macgm120 on 5/12/2016.
 */
public class MiniGolf extends AbstractAttraction {
    private int holes;
    private int diff;
    public MiniGolf(int numHoles, int newsDifficulty, String newCourseName) {
        holes = numHoles;
        diff = newsDifficulty;
        name = newCourseName;
    }
    public void renovateCourse(int numHoles, int newsDifficulty, String newCourseName){
        holes = numHoles;
        diff = newsDifficulty;
        name = newCourseName;
    }

}