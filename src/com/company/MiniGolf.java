package com.company;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by macgm120 on 5/12/2016.
 */
public class MiniGolf extends AbstractAttraction {
    private int holes;//number of holes in the course
    private int diff;//course difficulty on a 1-10 scale
    public MiniGolf(int numHoles, int newDifficulty, String newCourseName, double newProfit, double newCost) {
        holes = numHoles;
        diff = newDifficulty;
        name = newCourseName;
        profitPerRider = roundToTwo(newProfit);
        costToRun = roundToTwo(newProfit);
    }

    public void renovateCourse(int numHoles, int newsDifficulty){
        holes = numHoles;
        diff = newsDifficulty;
    }

    protected BigDecimal rideAttraction(int riders){
        BigDecimal thing = profitPerRider.multiply(BigDecimal.valueOf(riders)).subtract(costToRun);
        return roundToTwo(thing);
    }

}