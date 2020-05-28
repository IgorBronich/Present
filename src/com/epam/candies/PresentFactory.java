package com.epam.candies;

import com.epam.candies.model.*;

public  class PresentFactory {


    public static Present createPresent(){
        Present present = new Present();

        ChocolateCandy chocolateCandy = new ChocolateCandy("RedCap", 15,16);
        present.addCandy(chocolateCandy);

        CaramelCandy caramelCandy = new CaramelCandy("MuMu", 10, 10);
        present.addCandy(caramelCandy);

        Candy candyBar = new CandyBar("RotFront", 13, 13);
        present.addCandy(candyBar);

        return present;
    }



}