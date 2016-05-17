package com.company;
//Calvin Lee
public class StarWarsSim extends AbstractAttraction
{
    private String scene; //Name of the specific simulation
    private int movement; //Ranks movement of simulator, 1-5
    public StarWarsSim(String newName, int newCost, int newProfit,int newHeight)
    {
        height = newHeight;
        name = newName;
        costToRun = newCost;
        profitPerRider = newProfit;

    }

    protected int rideAttraction(int riders){
        return (riders*profitPerRider)-costToRun;
    }
}
