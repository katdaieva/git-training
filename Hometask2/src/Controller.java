/**
 * Created by User on 21.07.2017.
 */
import java.util.Scanner;

public class Controller {
    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);
        view.RAND_MIN = 0;
        view.RAND_MAX = 100;
        model.secretNumber = model.rand(view.RAND_MIN,view.RAND_MAX);
        view.printTask(view.RAND_MIN, view.RAND_MAX);
        model.newNumber = inputIntValueWithScanner(sc);
        while (model.giveAnswer(model.newNumber, model.secretNumber) == false) {
            if (model.comparing(model.newNumber, model.secretNumber) == "left") {
                view.RAND_MIN = model.newNumber;
            } else view.RAND_MAX = model.newNumber;
            view.printTask(view.RAND_MIN, view.RAND_MAX);
            model.newNumber = inputIntValueWithScanner(sc);
        }
        view.printMessage("You've done!");
    }

    // The Utility methods
    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(view.INPUT_INT_DATA);
        while (! sc.hasNextInt()) {
            view.printMessage(view.WRONG_DATA);
        };
        /*while ((sc.nextInt() > view.RAND_MAX) || (sc.nextInt() < view.RAND_MIN)) {
            view.printMessage("Please, don't forget about your range!");
        }*/
        return sc.nextInt();

    }

}
