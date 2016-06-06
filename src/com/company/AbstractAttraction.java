package com.company;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Created by Justin on 5/12/2016.
 */
public abstract class AbstractAttraction {
    public String getName() {
        return name;
    }
    public int getHeight() {return height;}
    public BigDecimal getProfit() {return profitPerRider;}
    public BigDecimal getCost() {return costToRun;}

    BigDecimal profitPerRider;
    String name;
    int height;
    BigDecimal costToRun; //Per ride

    protected final int HOURS_OF_OPERATION_PER_DAY = 9;

    protected void changeName(String newName) {
        name = newName;
    }
    protected void changeHeight(int newName) {
        height = newName;
    }
    protected void changeCost(double newName) {
        costToRun = roundToTwo(newName);
    }
    protected void changeProfit(double newName) {
        profitPerRider = roundToTwo(newName);
    }

    //Rounds to two decimal places
    public static BigDecimal roundToTwo(double moneyValue) {
        return BigDecimal.valueOf(moneyValue).setScale(2, RoundingMode.HALF_UP);
    }

    public static BigDecimal roundToTwo(BigDecimal moneyValue) {
        return moneyValue.setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * @param riders the number of riders
     * @return the profit of riding the ride
     */

    abstract protected BigDecimal rideAttraction(int riders);

    protected AbstractAttraction()
    {
        name = "Tester attraction";
    }
}
