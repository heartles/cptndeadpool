package com.company;

import java.math.BigDecimal;
import java.math.MathContext;

//Calvin Lee
public class StarWarsSim extends AbstractAttraction
{
    private String scene; //Name of the specific simulation
    private int movement; //Ranks movement of simulator, 1-5
    private int maxPatrons;
    String Response;
    public StarWarsSim(String newName, double newCost, double newProfit,int newHeight, int seats, String sceneName,int newMovement)
    {
        BigDecimal A = new BigDecimal(newCost);
        BigDecimal B = new BigDecimal(newProfit);
        movement = newMovement;
        scene = sceneName;
        maxPatrons = seats;
        height = newHeight;
        name = newName;
        costToRun = A;
        profitPerRider = B;


        if (movement > 3)
            Response = ("This ride is for the common man. Movement value is " + movement);
        else if (movement == 5)
            Response =  "This ride will kill you. Movement value is " + movement;
        else if (movement < 3)
            Response = "This ride is for wimps. Movement value is " + movement;
    }
    public String SafetyCheck()
    {
        return Response;
    }
    public String Scene(){
        return "Welcome to " + scene;
    }

    protected BigDecimal rideAttraction(int riders) {
        BigDecimal Results = profitPerRider.multiply(BigDecimal.valueOf(riders)).subtract(costToRun);
        return Results;
    }


}
