package com.company;

/**
 * Created by jbmde on 5/16/2016.
 */
public class WavePool extends WaterFeature {
    boolean active;

    final double ACTIVE_POOL_LG_RATIO = 10;
    final double UNACTIVE_POOL_LG_RATIO = 15;

    public boolean isActive() { return active; }

    public void activate() {
        setMaxPatronLgRatio(ACTIVE_POOL_LG_RATIO);
        active = true;
    }

    public void deactivate() {
        setMaxPatronLgRatio(UNACTIVE_POOL_LG_RATIO);
        active = false;
    }
}
