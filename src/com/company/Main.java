package com.company;

import java.math.BigDecimal;

/* Contains methods for testing classes*/
public class Main {

    public static void main(String[] args) {
        roundTest();
        waterSlideTest();
        coasterTest();
    }

    public static void coasterTest(){
        Rollercoaster c1 = new Rollercoaster(30, 400, 3.25, 8, 5.00,25.00);
        Rollercoaster c2 = new Rollercoaster(40, 550, 3.75, 10, 6.50,30.00);
        Rollercoaster c3 = new Rollercoaster(20, 350, 6, 5, 4.00,20.00);

        System.out.println(c1.printerFromRide(30));
        System.out.println(c1.printerFromRide(17));
        System.out.println(c1.printerFromRide(73));

        System.out.println(c2.printerFromRide(40));
        System.out.println(c2.printerFromRide(33));
        System.out.println(c1.printerFromRide(55));

        System.out.println(c3.printerFromRide(20));
        System.out.println(c3.printerFromRide(11));
        System.out.println(c1.printerFromRide(35));

        System.out.println(c1.printerFromHour());
        System.out.println(c2.printerFromHour());
        System.out.println(c3.printerFromHour());

        System.out.println(c1.printerFromDay());
        System.out.println(c2.printerFromDay());
        System.out.println(c3.printerFromDay());


    }

    public static void roundTest() {
        System.out.println("roundToTwo Test: ");

        double a = 0;
        BigDecimal aDec = AbstractAttraction.roundToTwo(a);
        System.out.println("a : double = " + a);
        System.out.println("aDec : BigDecimal = " + aDec.toString());

        double b = 3.14;
        BigDecimal bDec = AbstractAttraction.roundToTwo(b);
        System.out.println("b : double = " + b);
        System.out.println("bDec : BigDecimal = " + bDec.toString());

        double c = 3.14159;
        BigDecimal cDec = AbstractAttraction.roundToTwo(c);
        System.out.println("c : double = " + c);
        System.out.println("cDec : BigDecimal = " + cDec.toString());

        double d = 1.689;
        BigDecimal dDec = AbstractAttraction.roundToTwo(d);
        System.out.println("d : double = " + d);
        System.out.println("dDec : BigDecimal = " + dDec.toString());

        double e = 11546152.689;
        BigDecimal eDec = AbstractAttraction.roundToTwo(e);
        System.out.println("e : double = " + e);
        System.out.println("eDec : BigDecimal = " + eDec.toString());

        System.out.println();

        BigDecimal foo = BigDecimal.valueOf(342.4324);
        System.out.println("foo = " + foo.toString() + ", rounded = " + AbstractAttraction.roundToTwo(foo).toString());

        BigDecimal bar = BigDecimal.valueOf(15189.998);
        System.out.println("bar = " + bar.toString() + ", rounded = " + AbstractAttraction.roundToTwo(bar).toString());

        System.out.println();
    }


    public static void waterSlideTest() {
        System.out.println("WaterSlide Test: ");

        WaterSlide slide = new WaterSlide("SuperSlide", 300, 700, 1, 1, 4);
        System.out.println("Slide SuperSlide:\n  300 ft tall\n  700 feet long\n  1 lifeguard on duty\n  $1 per ride\n  4 loops");
        System.out.printf("Slide getName - expected : SuperSlide - actual : %s\n", slide.getName());

        System.out.printf("Lifeguard cost - expected : 0.06 - actual : %f\n", slide.getCostPerLG());
        System.out.printf("Lifeguard count - expected : 1 - actual : %d\n", slide.getLifeguardsOnDuty());
        System.out.printf("Safety Index : %f\n", slide.getSafetyIndex());
        System.out.printf("Fun Index : %f\n", slide.getFunIndex());
        System.out.printf("Loops : %f\n", slide.getLoops());
        System.out.printf("Cost to run per ride - expected : 0.10 - actual : %f\n", slide.getCost().doubleValue());
        System.out.printf("Price of ride: %f\n", slide.getPrice());
        System.out.printf("Profit per ride: %f\n", slide.getProfit().doubleValue());
        System.out.println("Expected profit of sending 3 patrons on the slide : 2.70");
        System.out.println("Sending 3 patrons on the slide:");
        slide.rideAttraction(3);
        System.out.printf("isSafe() returns %s because safety index < 2\n", String.valueOf(slide.isSafe()));
        System.out.println();
        System.out.println("Increasing number of lifeguards to 3");
        slide.setLifeguardsOnDuty(3);
        System.out.printf("New Safety Index : %f\n", slide.getSafetyIndex());
        System.out.printf("isSafe() returns %s because safety index > 2\n", String.valueOf(slide.isSafe()));
        System.out.printf("New Cost : %f\n", slide.getCost());
        System.out.printf("New Profit : %f\n", slide.getProfit());

        System.out.println();
        System.out.printf("Oh no! The boss demands at least 500%% profit!\nRight now we only have %f%% profit\n", slide.getProfit().doubleValue() / slide.getCost().doubleValue() * 100);
        System.out.println();

        System.out.println("Increasing cost to $2");
        slide.setPrice(2);
        System.out.printf("Cost remains the same as before.\n");
        System.out.printf("New Profit : %f\n", slide.getProfit());
        System.out.printf("Now we have %f%% profit! The boss will be happy!\n", slide.getProfit().doubleValue() / slide.getCost().doubleValue() * 100);

        System.out.println("Sending 3 patrons down the slide safely for 2$ each...");
        System.out.printf("Total profit: %f\n", slide.rideAttraction(3));

        System.out.printf("Gallons of water used: %f\n", slide.getGallonsUsed());


    }
}
/*
This might get to everyone late, but is there a way to file certain clsses in folders so that we don't need to scroll
through all the other classes to get to the one we need?
 */
