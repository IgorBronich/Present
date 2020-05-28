package com.epam.candies.view;

import com.epam.candies.PresentFactory;
import com.epam.candies.logic.PresentCalculator;
import com.epam.candies.model.Candy;
import com.epam.candies.model.Present;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class ConsolePresentPrinter implements PresentPrinter {

    @Override
    public void print(Present present) {


        List<Candy> list = present.getCandyList();

        for(Candy candy: list){
            System.out.println(candy.getName() + " " + candy.getWeight() + " грамм, " + candy.getPrice() + " рублей.");
        }

        System.out.println(" ");

        PresentCalculator presentCalculator = new PresentCalculator();
        double weight = presentCalculator.calculateWeight(present);
        double price = presentCalculator.calculatePrice(present);
        System.out.println("Вес всего подарка = " + weight + " грамм.");
        System.out.println("Стоимость подарка = " + price + " рублей.");
    }
}
