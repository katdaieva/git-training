/**
 * Created by User on 17.08.2017.
 */
public interface CarForFueling {
    public boolean isTankState();
    public void setTankState(boolean tankState);

    public FuelType getFuelType();
    public void setFuelType(FuelType fuelType);
}
