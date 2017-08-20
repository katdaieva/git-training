package dao;

import model.service.DriverCategory;

import static model.service.DriverCategory.*;

/**
 * Created by User on 18.08.2017.
 */
public enum DriverDAO {
    IVANOV(B, C),
    SIDOROV(B, C, D);
    DriverCategory category[];

    DriverDAO(DriverCategory...category) {
        this.category = category;
    }

}
