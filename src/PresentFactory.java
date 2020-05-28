import model.Candy;
import model.CandyBar;
import model.CaramelCandy;
import model.ChocolateCandy;

public  class PresentFactory {


    public static Present createPresent(){
        ChocolateCandy chocolateCandy = new ChocolateCandy("RedCap", 15,16);
        CaramelCandy caramelCandy = new CaramelCandy("MuMu", 10, 10);
        Candy candyBar = new CandyBar("RotFront", 13, 13);

        Present present = new Present();
        present.addCandy(chocolateCandy);
        present.addCandy(caramelCandy);
        present.addCandy(candyBar);

        return present;
    }



}