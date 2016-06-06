package com.company;

import javafx.application.Application;

import java.math.BigDecimal;

/**
 * Created by jbmde on 5/30/2016.
 */
public class WaterSlide extends AbstractAttraction {

    // fractional number of loops in the slide
    private double loops;
    //Dollars per foot
    private double costPerFootLength = 0.1;
    private int lifeguardsOnDuty;
    private double length;
    private double price;
    private double gallonsUsedPerRide = 70;
    private final double WATER_COST_PER_GALLON = 0.0005;
    //the total amount of gallons used to power the waterslide
    private double gallonsUsed = 0;
    //Cost of a Lifeguard for each ride
    private double costPerLG = 0.06;

    // Override of base class
    public BigDecimal rideAttraction(int riders) {
        if (!isSafe()) {
            System.out.println("Oh no, the riders can't ride because the ride isn't safe!");
            return BigDecimal.ZERO;
        }
        gallonsUsed += gallonsUsedPerRide * riders;
        return getProfit().multiply(new BigDecimal(riders));
    }


    //region Simple Getter/Setters
    public int getLifeguardsOnDuty() {
        return lifeguardsOnDuty;
    }

    public void setLifeguardsOnDuty(int lifeguardsOnDuty) {
        this.lifeguardsOnDuty = lifeguardsOnDuty;
        recalculateCostAndProfit();
    }

    public double getCostPerLG() {
        return costPerLG;
    }

    public void setCostPerLG(double costPerLG) {
        this.costPerLG = costPerLG;
        recalculateCostAndProfit();
    }

    public double getGallonsUsed() {
        return gallonsUsed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        recalculateCostAndProfit();
    }

    public double getLoops() {
        return loops;
    }
    //endregion

    final double LG_SAFETY_COEFFICIENT = 5;
    public double getSafetyIndex() {
        return (lifeguardsOnDuty * LG_SAFETY_COEFFICIENT) / (getSpeed() + loops);
    }

    final double SPEED_COEFFICIENT = 3;
    public double getSpeed() {
        return (height / length) * SPEED_COEFFICIENT;
    }


    public WaterSlide(String name, int height, double length, int lifeguards, double price, double loops) {
        changeName(name);
        changeHeight(height);
        this.length = length;
        lifeguardsOnDuty = lifeguards;
        this.price = price;
        this.loops = loops;

        recalculateCostAndProfit();
    }

    public boolean isSafe() {
        return getSafetyIndex() > 2;
    }

    private void recalculateCostAndProfit() {
        changeCost(
            (gallonsUsedPerRide * WATER_COST_PER_GALLON) +
            (costPerLG * lifeguardsOnDuty));
        changeProfit(price - getCost().doubleValue());
    }

    public double getFunIndex() {
        return getSpeed() * loops;
    }
}
