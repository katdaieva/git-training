package dao;

import model.service.DriverCategory;

import java.util.*;

/**
 * Created by User on 18.08.2017.
 */
public class AllDriverLicense {
    private HashMap<String, List<DriverCategory>> db;

    public AllDriverLicense() {
        db = new HashMap<>();
        for (DriverDAO driverDAO : DriverDAO.values()) {
            db.put(driverDAO.name(), Arrays.asList(driverDAO.category));
        }
    }
    public void addData (String name, List<DriverCategory> categoryList) {
        db.put(name, categoryList);
    }
    public List<DriverCategory> getData(String name) {
        if (db.containsKey(name)) {
            return db.get(name);
        } else {
            return null;
        }
    }
}
