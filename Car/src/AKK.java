import repair.RepairingStation;
import service.FuelingStation;
import service.ServiceStation;

/**
 * Created by User on 17.08.2017.
 */
public class AKK {
    String name;
    FuelingStation fuelingStation;
    RepairingStation repairingStation;
    ServiceStation serviceStation;

    public AKK(String name, FuelingStation fuelingStation, RepairingStation repairingStation, ServiceStation serviceStation) {
        this.name = name;
        this.fuelingStation = fuelingStation;
        this.repairingStation = repairingStation;
        this.serviceStation = serviceStation;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public FuelingStation getFuelingStation() {
        return fuelingStation;
    }
    public void setFuelingStation(FuelingStation fuelingStation) {
        this.fuelingStation = fuelingStation;
    }

    public RepairingStation getRepairingStation() {
        return repairingStation;
    }
    public void setRepairingStation(RepairingStation repairingStation) {
        this.repairingStation = repairingStation;
    }

    public ServiceStation getServiceStation() {
        return serviceStation;
    }
    public void setServiceStation(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }
}
