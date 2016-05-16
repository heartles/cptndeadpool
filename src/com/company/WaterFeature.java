package com.company;

/**
 * Created by jbmde on 5/16/2016.
 */

// TODO(JJ): our current idea of an AbstractAttraction doesn't mesh well with water features
// A lot of the members of AbstractAttraction don't make a ton of sense when viewed in relation
// with WaterFeatures.
public class WaterFeature {

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
