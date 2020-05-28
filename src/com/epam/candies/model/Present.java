package com.epam.candies.model;

import com.epam.candies.model.Candy;

import java.util.ArrayList;
import java.util.List;

public class Present{
    private List<Candy> candyList = new ArrayList<>();

    public void addCandy(Candy candy){
        candyList.add(candy);
    }

    public List<Candy> getCandyList() {
        return candyList;
    }




}
