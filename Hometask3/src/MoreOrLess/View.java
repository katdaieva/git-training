/**
 * Created by User on 21.07.2017.
 */
package MoreOrLess;

public class View {
    public int RAND_MIN;
    public int RAND_MAX;
    public void printMessage (String message) {
        System.out.println(message);
    }
    public void printTask (int RAND_MIN, int RAND_MAX) {
        System.out.println("New range: "+RAND_MIN + ' '+ RAND_MAX);
    }
    public static final String INPUT_INT_DATA = "Guess the number!";
    public static final String MORE_THAN_SECRET = " > secretNumber";
    public static final String LESS_THAN_SECRET = " < secretNumber";
    public static final String VICTORY = "Finally! You guessed!";
    public static final String WRONG_DATA = "Incorrect data, input the number please!";
    public static final String OUT_OF_RANGE = "Out of range!";
}
