/**
 * Created by User on 21.07.2017.
 */
package MoreOrLess;

public class Main {
    public static void main(String[] args) {
        //Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model,view  );

        //Run
        controller.processUser();
    }
}
