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
        model.setValue(inputIntValueWithScanner(sc));
        model.concatValues(model.getValue());
        model.setValue(inputIntValueWithScanner(sc));
        model.concatValues(model.getValue());

        view.printMessage(model.getValueConcat());
}

    // The Utility methods
    public String inputIntValueWithScanner(Scanner sc) {
        view.printMessage(view.INPUT_INT_DATA);
        return sc.next();
    }
}
