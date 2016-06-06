package com.company;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by macgm120 on 5/12/2016.
 */
public class FerrisWheel extends AbstractAttraction {
    public FerrisWheel(int newHeight, String newName, BigDecimal newProfit,BigDecimal newCost) {
        height = newHeight;
        name = newName;
        profitPerRider= newProfit;
        costToRun=newCost;
    }
    protected BigDecimal rideAttraction(int riders){
        BigDecimal profit = profitPerRider.multiply(BigDecimal.valueOf(riders)).subtract(costToRun);
        return roundToTwo(profit);
    }
}
