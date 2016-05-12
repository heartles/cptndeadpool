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

    String name;
    int height;

    protected AbstractAttraction()
    {
        name = "Tester attraction";
    }
}
