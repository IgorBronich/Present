package com.epam.candies;

import com.epam.candies.logic.PresentCalculator;
import com.epam.candies.model.Present;
import com.epam.candies.view.ConsolePresentPrinter;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Present present = PresentFactory.createPresent();
        ConsolePresentPrinter consolePresentPrinter = new ConsolePresentPrinter();

        consolePresentPrinter.print(present);

    }

}
