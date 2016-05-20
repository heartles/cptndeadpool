package com.company;

import java.math.BigDecimal;

/**
 * Created by macgm120 on 5/16/2016.
 */
public class Rollercoaster extends AbstractAttraction{
    public Rollercoaster(BigDecimal newHeight, String newName, BigDecimal newProfit,BigDecimal newCost) {
        height = newHeight;
        name = newName;
        profitPerRider= newProfit;
        costToRun=newCost;
    }
    protected BigDecimal rideAttraction(BigDecimal riders){
        return profitPerRider.multiply(riders).subtract(costToRun);
    }
}
