package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by macgm120 on 5/26/2016.
 */
public class FancyRestaurant extends AbstractRestaurant{
    public ArrayList<Food> wines;
    public ArrayList<Food> sodas;
    public FancyRestaurant(ArrayList<Food> nMenu, ArrayList<Food> nWines, ArrayList<Food> nSodas){
        menu=nMenu;
        wines=nWines;
        sodas=nSodas;
    }
    public ArrayList<Food> takeWines(int[] customers,String[] orders){
        ArrayList<Food> toReturn= new ArrayList<Food>();
        BigDecimal firstSlot=new BigDecimal(0.0);
        BigDecimal secondSlot=new BigDecimal(0.0);
        for(int x=0;x<customers.length;x++) {
            if (customers[x] < 18) {
                firstSlot.subtract(firstSlot);
                secondSlot.subtract(firstSlot);
                toReturn.add(new Food("Too Young to Drink", firstSlot.ulp(), secondSlot.ulp()));
            }
            else{
                for(int w=0;w<customers.length;w++){
                    for(int z=0;z<wines.size();z++){
                        if(orders[w]==wines.get(z).returnName()){
                            toReturn.add(wines.get(z));
                        }
                    }
                }
            }
        }
        return toReturn;
    }
}
