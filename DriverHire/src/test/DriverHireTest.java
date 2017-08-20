package test;

import model.service.DriverCategory;
import model.service.DriverHire;
import org.junit.Assert;
import org.junit.Test;

import static model.service.DriverCategory.*;

/**
 * Created by User on 18.08.2017.
 */
public class DriverHireTest {
    public enum DriverDAO {
        IVANOV(B, C),
        SIDOROV(B, C, D);
        DriverCategory category[];

        DriverDAO(DriverCategory...category) {
            this.category = category;
        }
    }

    @Test
    public void testCheckDriverLicenseIvanov() {
        DriverHire driverHire = new DriverHire();
        driverHire.setNameAndStatus("IVANOV","");
        Assert.assertEquals(false, driverHire.checkDriverLicense());
    }

    @Test
    public void testCheckDriverLicenceSidorov() throws Exception {
        DriverHire driverHire = new DriverHire();
        driverHire.setNameAndStatus("SIDOROV", "");
        Assert.assertEquals(true, driverHire.checkDriverLicense());
    }
}
