package com.company;

/**
 * Created by macgm120 on 5/12/2016.
 */
public class MiniGolf extends AbstractAttraction {
    private int holes;
    private int diff;
    private String courseName;
    public MiniGolf(int numHoles, int newsDifficulty, String newCourseName) {
        holes = numHoles;
        diff = newsDifficulty;
        courseName = newCourseName;
    }
}
