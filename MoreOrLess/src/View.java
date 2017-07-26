/**
 * Created by User on 26.07.2017.
 */
public class View {
    public int RAND_MIN;
    public int RAND_MAX;
    public void printMessage (String message) {
        System.out.println(message);
    }
    public void printTask (int RAND_MIN, int RAND_MAX) {
        System.out.println("new range: "+RAND_MIN + ' '+ RAND_MAX);
    }
    public static final String INPUT_INT_DATA = "Guess the number!";
    public static final String WRONG_DATA = "Incorrect data, input the number please!";
}
