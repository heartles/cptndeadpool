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

    int profitPerRider;
    String name;
    int height;

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
