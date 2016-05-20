package com.company;

import java.math.BigDecimal;

/**
 * Created by Justin on 5/12/2016.
 */
public abstract class AbstractAttraction {
    public String getName() {
        return name;
    }
    public BigDecimal getHeight() {return height;}
    public BigDecimal getProfit() {return profitPerRider;}
    public BigDecimal getCost() {return costToRun;}

    BigDecimal profitPerRider;
    String name;
    BigDecimal height;
    BigDecimal costToRun;

    protected void changeName(String newName) {
        name = newName;
    }
    protected void changeHeight(BigDecimal newName) {
        height = newName;
    }
    protected void changeCost(BigDecimal newName) {
        costToRun = newName;
    }
    protected void changeProfit(BigDecimal newName) {
        profitPerRider = newName;
    }
    // TODO(JJ): is it really a good idea to use integers to represent money?
    //use the built-in BigDecimal class

    /**
     * @param riders the number of riders
     * @return the profit of riding the ride
     */

    abstract protected BigDecimal rideAttraction(BigDecimal riders);

    protected AbstractAttraction()
    {
        name = "Tester attraction";
    }
}
