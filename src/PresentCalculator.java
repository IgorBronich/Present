import model.Candy;

import java.util.List;

public class PresentCalculator {
    public static double weightCalculator(Present present){
        double presentWeight = 0;
        List<Candy>calculateList = present.getCandyList();
        for(Candy candy: calculateList){
            presentWeight += candy.getWeight();
        }
        return presentWeight;
    }

    public double priceCalculator(Present present){
        double presentPrice = 0;
        List<Candy>calculateList = present.getCandyList();
        for(Candy candy: calculateList){
            presentPrice += candy.getPrice();
        }
        return presentPrice;
    }

}
