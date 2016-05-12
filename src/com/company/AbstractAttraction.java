package com.company;

import java.math.BigDecimal;

/**
 * Created by Justin on 5/12/2016.
 */
public abstract class AbstractAttraction {
    public String getName() {
        return name;
    }

    String name;

    protected AbstractAttraction()
    {
        name = "Tester attraction";
    }
}
