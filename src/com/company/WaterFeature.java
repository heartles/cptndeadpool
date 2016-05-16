package com.company;

/**
 * Created by jbmde on 5/16/2016.
 */
public class WaterFeature extends AbstractAttraction {

    int lifeguards;
    int patrons;

    double maxPatronLgRatio = 15;

    protected void setMaxPatronLgRatio(double newRatio) {
        maxPatronLgRatio = newRatio;
        staff();
    }

    public int getPatrons() { return patrons; }
    public int getLifeguards() { return lifeguards; }

    public boolean isAdequatelyStaffed() {
        return (patrons / lifeguards) <= maxPatronLgRatio;
    }

    public void staff() {
        lifeguards = (int)Math.ceil(patrons / maxPatronLgRatio);
    }

    public void addPatrons(int patrons) {
        this.patrons += patrons;
    }
}
