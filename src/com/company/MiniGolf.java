package com.company;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by macgm120 on 5/12/2016.
 */
public class MiniGolf extends AbstractAttraction {
    private int holes;//number of holes in the course
    private int diff;//course difficulty on a 1-10 scale
    public MiniGolf(int numHoles, int newsDifficulty, String newCourseName, double newProfit,double newCost) {
        holes = numHoles;
        diff = newsDifficulty;
        name = newCourseName;
        profitPerRider=BigDecimal.valueOf(newProfit).round(new MathContext(String.valueOf(((int) newProfit))+2));
        costToRun = BigDecimal.valueOf(newCost).round(new MathContext(String.valueOf(((int) newCost))+2));
    }
    public void renovateCourse(int numHoles, int newsDifficulty){
        holes = numHoles;
        diff = newsDifficulty;
    }
    protected BigDecimal rideAttraction(int riders){
        BigDecimal thing = profitPerRider.multiply(BigDecimal.valueOf(riders)).subtract(costToRun);
        return thing.round(new MathContext(String.valueOf(((int) thing.doubleValue()))+2));
    }

}