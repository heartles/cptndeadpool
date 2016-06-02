package com.company;

import java.util.ArrayList;

/**
 * Created by macgm120 on 5/20/2016.
 */
public class BurgerPlace extends AbstractRestaurant {
    public BurgerPlace(ArrayList<Food> nMenu, ArrayList<Food> nSodas){
        menu=nMenu;
        sodas=nSodas;
    }
    private ArrayList<Food> sodas= new ArrayList<>();
    /**
     * makes a list of the food and sodas, with the food first
     * @return a list with both the food and sodas
     */
    public ArrayList<Food> menuAndSodas(){
        ArrayList<Food> toReturn=menu;
        for(int i=0; i<sodas.size();i++) {
            toReturn.add(sodas.get(i));
        }
        return toReturn;
    }
    protected void addToSodas(Food newItem) {
        sodas.add(newItem);
    }

}

