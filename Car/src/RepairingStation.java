/**
 * Created by User on 17.08.2017.
 */
public class RepairingStation {
    public CarForEngineRepairing repairingEngine(CarForEngineRepairing car) {
        if (car.isEngineState() == true) {
            car.setEngineState(false);
        }
        return car;
    }

    public CarForUndercarriageRepairing repairingUndercarriage(CarForUndercarriageRepairing car) {
        if (car.isUndercarriageState() == true) {
            car.setUndercarriageState(false);
        }
        return car;
    }
}
