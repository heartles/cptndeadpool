package com.company;

import java.math.BigDecimal;

/**
 * Created by Justin on 5/12/2016.
 */
public abstract class AbstractAttraction {
    public String getName() {
        return name;
    }
    public int getHeight() {return height;}
    public int getProfit() {return profitPerRider;}
    public int getCost() {return costToRun;}

    int profitPerRider;
    String name;
    int height;
    int costToRun;

    protected void changeName(String newName) {
        name = newName;
    }
    protected void changeHeight(int newName) {
        height = newName;
    }
    protected void changeCost(int newName) {
        costToRun = newName;
    }
    protected void changeProfit(int newName) {
        profitPerRider = newName;
    }
    // TODO(JJ): is it really a good idea to use integers to represent money?
    // Even if we are tracking number of cents, that point isn't clearly conveyed in code.
    // Potential solutions: use the built-in BigDecimal class, or abstract our representation
    // of money into some other class.

    /**
     * @param riders the number of riders
     * @return the profit of riding the ride
     */

    abstract protected int rideAttraction(int riders);

    protected AbstractAttraction()
    {
        name = "Tester attraction";
    }
}
