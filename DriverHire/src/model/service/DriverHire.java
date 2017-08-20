package model.service;

import dao.AllDriverLicense;
import dao.DriverDAO;
import model.entity.HumanToWorkHire;

import java.util.*;

/**
 * Created by User on 18.08.2017.
 */
public class DriverHire implements HumanToWorkHire {
    private String name;
    private String workStatus;
    private String companyName = "Google";
    List<DriverCategory> actualDriverCategory = new ArrayList<>();

    {
        actualDriverCategory.add(DriverCategory.C);
        actualDriverCategory.add(DriverCategory.D);
    }

    public void setNameAndStatus(String name, String status) {
        this.name = name;
        this.workStatus = status;
    }

    @Override
    public String getWorkStatus() {
        return Optional.empty().toString();
    }

    public boolean checkDriverLicense() {
        AllDriverLicense allDriverLicense = new AllDriverLicense();
        return (workStatus.isEmpty() && allDriverLicense.getData(name).containsAll(actualDriverCategory));
    }

    public void getNameAndStatus(String name, String workStatus) {

    }
}
