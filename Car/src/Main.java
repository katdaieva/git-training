import entity.Car;
import entity.FuelType;
import repair.RepairingStation;
import service.FuelingStation;
import service.ServiceStation;

/**
 * Created by User on 17.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car(true,false,false,true,false, FuelType.A92);

        Diagnostic diagnostic = new Diagnostic();
        diagnostic.carDiagnostic(car);

        AKK akk = new AKK("WOG", new FuelingStation(), new RepairingStation(), new ServiceStation());
        akk.repairingStation.repairingEngine(car);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.pumpingWheels(car);

        diagnostic.carDiagnostic(car);
    }
}
