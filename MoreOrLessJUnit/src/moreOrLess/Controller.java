package moreOrLess;

import java.util.Scanner;
/**
 * Created by User on 26.07.2017.
 */

public class Controller {
    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        view.RAND_MIN = 0;
        view.RAND_MAX = 100;
        model.secretNumber = model.rand(view.RAND_MIN, view.RAND_MAX);
        view.printTask(view.RAND_MIN, view.RAND_MAX);
        model.newNumber = inputIntValueWithScanner(sc);
        while (model.giveAnswer(model.newNumber, model.secretNumber) != "Yes") {
            if (model.giveAnswer(model.newNumber, model.secretNumber) == "More") {
                view.RAND_MAX = model.newNumber;
                view.printMessage(model.newNumber + view.MORE_THAN_SECRET);
            } else {
                view.RAND_MIN = model.newNumber;
                view.printMessage(model.newNumber + view.LESS_THAN_SECRET);
            }
            view.printTask(view.RAND_MIN, view.RAND_MAX);
            model.newNumber = inputIntValueWithScanner(sc);
        }
        view.printMessage(view.VICTORY);
    }

    // The Utility methods
    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(view.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_DATA);
            sc.next();
        }
        /*while ((sc.nextInt()<= view.RAND_MIN)||(sc.nextInt() >= view.RAND_MAX)) {
            view.printMessage(view.OUT_OF_RANGE);
            //if ((sc.nextInt()<= view.RAND_MIN)||(sc.nextInt() >= view.RAND_MAX)) sc.next();
        }*/
        return sc.nextInt();

    }

}

