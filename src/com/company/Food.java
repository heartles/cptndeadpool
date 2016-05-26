package com.company;

import java.math.BigDecimal;

/**
 * Created by macgm120 on 5/16/2016.
 */
public class Food {
    public String foodName;
    public BigDecimal foodCost;
    public BigDecimal foodPrice;
    public Food(String newName, BigDecimal cost, BigDecimal price){
        foodName= newName;
        foodCost= cost;
        foodPrice= price;
    }
    public void changePrice(BigDecimal nprice){
        foodPrice=nprice;
    }
    public void changeCost(BigDecimal nprice){
        foodCost=nprice;
    }
    public void changeName(String nprice){
        foodName=nprice;
    }
    public BigDecimal returnCost(){return foodCost;}
    public BigDecimal returnPrice(){return foodPrice;}
    public String returnName(){return foodName;}
}
