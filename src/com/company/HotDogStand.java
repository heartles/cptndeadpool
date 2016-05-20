package com.company;
import java.util.

/**
 * Created by macgm120 on 5/16/2016.
 */


public class HotDogStand extends AbstractRestaurant{
    public ArrayList<String> condiments;
    public HotDogStand(ArrayList<String> nCondiments){
        condiments=nCondiments;
    }
    public ArrayList<String> returnCondiments(){
        return condiments;
    }
    /**
     * addCondiment
     * @param toAdd the food to add the condiment
     * @param condimentSpot the spot on condiments that the desired condiment lies
     * @return toReturn returns the food with the name changed to add the condiment
     */
    public Food addCondiment(Food toAdd, int condimentSpot){
        Food toReturn= toAdd;
        toReturn.changeName(toReturn.returnName()+" and "+ condiments.get(condimentSpot));
        return toReturn;
    }

