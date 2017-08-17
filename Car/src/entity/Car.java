package entity;

/**
 * Created by User on 17.08.2017.
 */
public class Car implements CarForEngineRepairing, CarForUndercarriageRepairing, CarForFueling,
        CarForGlassesCleaning, CarForWheelsPumping{
    private boolean engineState;
    private boolean undercarriageState;
    private boolean tankState;
    private boolean wheelsState;
    private boolean glassesState;
    private FuelType fuelType;

    public Car(boolean engineState, boolean undercarriageState, boolean tankState,
               boolean wheelsState, boolean glassesState, FuelType fuelType) {
        this.engineState = engineState;
        this.undercarriageState = undercarriageState;
        this.tankState = tankState;
        this.wheelsState = wheelsState;
        this.glassesState = glassesState;
        this.fuelType = fuelType;
    }

    public boolean isEngineState() {
        return engineState;
    }
    public void setEngineState(boolean engineState) {
        this.engineState = engineState;
    }

    public boolean isUndercarriageState() {
        return undercarriageState;
    }
    public void setUndercarriageState(boolean undercarriageState) {
        this.undercarriageState = undercarriageState;
    }

    public boolean isTankState() {
        return tankState;
    }
    public void setTankState(boolean tankState) {
        this.tankState = tankState;
    }

    public boolean isWheelsState() {
        return wheelsState;
    }
    public void setWheelsState(boolean wheelsState) {
        this.wheelsState = wheelsState;
    }

    public boolean isGlassesState() {
        return glassesState;
    }
    public void setGlassesState(boolean glassesState) {
        this.glassesState = glassesState;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
}
