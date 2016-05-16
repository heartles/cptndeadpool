package com.company;

/**
 * Created by macgm120 on 5/16/2016.
 */
public class Rollercoaster extends AbstractAttraction{
    public Rollercoaster(int newHeight, String newName, int newProfit,int newCost) {
        height = newHeight;
        name = newName;
        profitPerRider= newProfit;
        costToRun=newCost;
    }
    protected int rideAttraction(int riders){
        return (riders*profitPerRider)-costToRun;
    }
}
