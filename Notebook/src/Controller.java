import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;

/**
 * Created by User on 28.07.2017.
 */
import java.util.regex.*;

public class Controller {
    //Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        view.printMessage(view.ASK_SURNAME);
        model.surname = inputValueWithScanner(sc,view.REG_NAME);
        view.printMessage(view.ASK_NAME);
        model.name = inputValueWithScanner(sc,view.REG_NAME);
        view.printMessage(view.ASK_PATRONYMIC);
        model.patronymic = inputValueWithScanner(sc,view.REG_NAME);
        view.printMessage(view.ASK_NICKNAME);
        model.nickname = inputValueWithScanner(sc,view.REG_NICKNAME);
        view.printMessage(view.ASK_COMMENT);
        model.comment = inputValueWithScanner(sc,view.REG_COMMENT);

    }

    public void showResult() {
        view.printMessage(view.concatenation("1. ", model.surname));
        view.printMessage(view.concatenation("2. ", model.name));
        view.printMessage(view.concatenation("3. ", model.patronymic));
        view.printMessage(view.concatenation("4. ", model.surname, " ", model.name));
        view.printMessage(view.concatenation("5. ", model.nickname));
        view.printMessage(view.concatenation("6. ", model.comment));
    }

    public String inputValueWithScanner(Scanner sc, String reg) {
        while (!(sc.hasNext()) || !(sc.next()).matches(reg)) {
            view.printMessage(view.INPUT_WRONG + reg);
        };
        return sc.next();
    }
}
