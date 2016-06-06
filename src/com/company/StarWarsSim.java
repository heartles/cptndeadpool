package com.company;

import java.math.BigDecimal;
import java.math.MathContext;

//Calvin Lee
public class StarWarsSim extends AbstractAttraction
{
    private String scene; //Name of the specific simulation
    private int movement; //Ranks movement of simulator, 1-5
    private int maxPatrons;
    public StarWarsSim(String newName, double newCost, double newProfit,int newHeight, int seats, String sceneName,int newMovement)
    {
        movement = newMovement;
        scene = sceneName;
        maxPatrons = seats;
        height = newHeight;
        name = newName;
        costToRun = BigDecimal.valueOf(newCost).round(new MathContext(String.valueOf(((int) newCost))+2));
        profitPerRider = BigDecimal.valueOf(newProfit).round(new MathContext(String.valueOf(((int) newProfit))+2));
    }

    public void Reaction(){
        int Move = movement;
        if (Move > 3)
            System.out.println("This ride is for the common man.");
        else if (Move == 5)
            System.out.println("This ride will kill you.");
        else if (Move < 3)
            System.out.println("This ride is for wimps.");
}
    public String Scene(){
        return "Welcome to " + scene;
    }

    protected BigDecimal rideAttraction(int riders) {
        BigDecimal Results = profitPerRider.multiply(BigDecimal.valueOf(riders)).subtract(costToRun);
        return Results;
    }


}
