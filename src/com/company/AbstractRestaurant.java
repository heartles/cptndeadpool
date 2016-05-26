package com.company;

import java.math.BigDecimal;
import java.util.*;
/**
 * Created by macgm120 on 5/16/2016. MAH BIRTHDAY!!
 */
public abstract class AbstractRestaurant {
    ArrayList<Food> menu=new ArrayList<Food>();
    protected ArrayList<Food> returnMenu(){
        return menu;
    }
    protected void addToMenu(Food newItem){
        menu.add(newItem);
    }
    public BigDecimal sellItem(String foodSold){
        BigDecimal result=null;
        for (Food aMenu : menu) {
            if (foodSold.equals(aMenu.foodName)) {
                result = (aMenu.foodPrice.subtract(aMenu.foodCost));
                break;
            }
        }
        return result;
    }
}
