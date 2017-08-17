/**
 * Created by User on 17.08.2017.
 */
public class ServiceStation {

    public CarForGlassesCleaning cleaningGlasses(CarForGlassesCleaning car) {
        if (car.isGlassesState() == true) {
            car.setGlassesState(false);
        }
        return car;
    }

    public CarForWheelsPumping pumpingWheels(CarForWheelsPumping car) {
        if (car.isWheelsState() == true) {
            car.setWheelsState(false);
        }
        return car;
    }
}
