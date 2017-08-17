package service;

import entity.CarForFueling;
import entity.FuelType;

/**
 * Created by User on 17.08.2017.
 */
public class FuelingStation{
    public CarForFueling fueling(CarForFueling car) {
        FuelType fuelType = car.getFuelType();
        if (car.isTankState() == true) {
            car.setTankState(false);
        }
        return car;
    }
}
