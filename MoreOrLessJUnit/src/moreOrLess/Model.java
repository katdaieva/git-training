package moreOrLess;

/**
 * Created by User on 26.07.2017.
 */

import java.lang.Math;

public class Model {    public int rand (int min, int max) {return min + (int) (Math.random() * max);}
    public int rand () {return (int) (Math.random() * 100);}
    public int secretNumber;
    public int newNumber;

    public String giveAnswer (int newNumber, int secretNumber) {
        if (newNumber == secretNumber) return "Yes";
        else if (newNumber > secretNumber) return "More";
        else return "Less";
    }
}
