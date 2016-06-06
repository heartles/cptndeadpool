package com.company;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by macgm120 on 5/16/2016.
 */
public class Rollercoaster extends AbstractAttraction {
    private int maxRiders;
    private double maxForce; //In G's
    private double time; // In minutes

    public Rollercoaster(int seats, int m_height, double force, double length, double price, double costtorun){
        maxRiders = seats;
        height = m_height;
        name = "Roller Coaster";
        maxForce = force;
        time = length;
        profitPerRider = BigDecimal.valueOf(price).round(new MathContext(String.valueOf(((int) price))+2));
        costToRun = BigDecimal.valueOf(costtorun).round(new MathContext(String.valueOf(((int) costtorun))+2));
    }
    public void changeSeats(int nSeats){maxRiders=nSeats;}
    public void changeMaxForce(double nForce){maxForce = nForce;}
    public void changeTime(double nLength){time = nLength;}

    protected BigDecimal rideAttraction(int riders){
        if(!willRide(riders)|| maxForce>4){
            return BigDecimal.valueOf(0);
        }
        else{
            BigDecimal profit;
            profit = profitPerRider.multiply(BigDecimal.valueOf(riders));
            profit = profit.subtract(costToRun);
            return profit.round(new MathContext(String.valueOf(((int) profit.doubleValue())).length()+2));

        }
    }

    public BigDecimal averageHourlyProfit(){
        if(maxForce>4) return BigDecimal.valueOf(0);
        else{
            double totalTime=0;
            BigDecimal profit = BigDecimal.valueOf(0);
            while (totalTime<60){
                profit = profit.add(rideAttraction(maxRiders/2));
                totalTime += time+7;
            }
            return profit.round(new MathContext(String.valueOf(((int) profit.doubleValue())).length()+2));
        }
    }

    public int numberOfSeats(){return maxRiders;}

    public boolean willRide(int riders){
        return (riders<=maxRiders && maxForce<=4);
    }

    public String printerFromRide(int riders) {
        if (maxForce < 5) {
            if (maxForce < 4) {
                if (willRide(riders) == rideAttraction(riders).doubleValue() > 0) return "You gained $" + rideAttraction(riders) + " from this ride.";
                else return "Oh no! There are too many people want to ride this coaster and the operator has a melt down from being overstressed! No profit made.";}
            else return "Your roller coaster is potentially dangerous. No profit.";
        }
        else return "Your roller coaster will literally kill people, please don't have people ride this monstrosity";
    }

    public String printerFromHour(){
        if (maxForce < 4) return "This coaster earned you $" + averageHourlyProfit() + " in one hour";
        else return "Your roller coaster will literally kill people, please don't have people ride this monstrosity";
    }

    public String printerFromDay(){
        BigDecimal thing = averageHourlyProfit().multiply(BigDecimal.valueOf(HOURS_OF_OPERATION_PER_DAY));
        if (maxForce < 5) {
            if (maxForce < 4) return "This coaster earned you $" + (thing.round(new MathContext(String.valueOf(((int) thing.doubleValue())).length()+2))) + " in one business day";
            else return "Your roller coaster is potentially dangerous. No profit.";
        }
        else return "Your roller coaster will literally kill people, please don't have people ride this monstrosity";
    }

}
