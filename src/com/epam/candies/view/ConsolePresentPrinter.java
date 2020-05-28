package com.epam.candies.view;

import com.epam.candies.PresentFactory;
import com.epam.candies.logic.PresentCalculator;
import com.epam.candies.model.Present;
import org.w3c.dom.ls.LSOutput;

public class ConsolePresentPrinter implements PresentPrinter {

    @Override
    public void print(Present present) {
        PresentCalculator presentCalculator = new PresentCalculator();

        double weight = presentCalculator.calculateWeight(present);
        double price = presentCalculator.calculatePrice(present);

        System.out.println("Вес подарка = " + weight + " грамм.");
        System.out.println("Стоимость подарка = " + price + " рублей.");
    }
}
