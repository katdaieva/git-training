import entity.Car;

/**
 * Created by User on 17.08.2017.
 */
public class    Diagnostic {
    public void carDiagnostic(Car car){
        if (car.isEngineState() == true) {
            System.out.println("Sorry, your engine isn't ok!");
        } else {
            System.out.println("Hmm, your engine is ok!");
        }
        if (car.isUndercarriageState() == true) {
            System.out.println("We think that your undercarriage is broken!");
        } else {
            System.out.println("We think that your undercarriage isn't broken!");
        }
        if (car.isTankState() == true) {
            System.out.println("Your tank is empty!");
        } else {
            System.out.println("Your tank isn't empty!");
        }
        if (car.isGlassesState() == true) {
            System.out.println("It would be great to clean your glasses.");
        } else {
            System.out.println("You don't need to clean the glasses.");
        }
        if (car.isUndercarriageState() == true) {
            System.out.println("Please, pump the wheels.");
        } else {
            System.out.println("You don't need to pump the wheels.");
        }
    }
}
