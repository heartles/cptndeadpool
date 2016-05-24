package com.company;

import java.math.BigDecimal;
import java.math.MathContext;

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
        costToRun = BigDecimal.valueOf(newName).round(new MathContext(String.valueOf(((int) newName))+2));
    }
    protected void changeProfit(double newName) {
        profitPerRider = BigDecimal.valueOf(newName).round(new MathContext(String.valueOf(((int) newName))+2));
    }
    //use the built-in BigDecimal class

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
