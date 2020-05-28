package com.epam.candies.logic;

import com.epam.candies.model.Candy;
import com.epam.candies.model.Present;

import java.util.List;

public class PresentCalculator {
    public double calculateWeight(Present present){
        double presentWeight = 0;
        List<Candy>calculateList = present.getCandyList();
        for(Candy candy: calculateList){
            presentWeight += candy.getWeight();
        }
        return presentWeight;
    }

    public double calculatePrice(Present present){
        double presentPrice = 0;
        List<Candy>calculateList = present.getCandyList();
        for(Candy candy: calculateList){
            presentPrice += candy.getPrice();
        }
        return presentPrice;
    }

}
