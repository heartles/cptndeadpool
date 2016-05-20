package com.company;

import java.math.BigDecimal;

/**
 * Created by macgm120 on 5/12/2016.
 */
public class MiniGolf extends AbstractAttraction {
    private int holes;//number of holes in the course
    private int diff;//course difficulty on a 1-10 scale
    public MiniGolf(int numHoles, int newsDifficulty, String newCourseName, BigDecimal newProfit, BigDecimal newCost) {
        holes = numHoles;
        diff = newsDifficulty;
        name = newCourseName;
        profitPerRider=newProfit;
        costToRun = newCost;
    }
    public void renovateCourse(int numHoles, int newsDifficulty){
        holes = numHoles;
        diff = newsDifficulty;
    }
    protected BigDecimal rideAttraction(BigDecimal riders){
        return profitPerRider.multiply(riders).subtract(costToRun);
    }
}