package model.entity;

import java.util.Date;

/**
 * Created by User on 18.08.2017.
 */
public class Human {
    private String name;
    private Date birthDate;
    public enum Gender {MALE, FEMALE};
    private Gender gender;
    public enum BloodGroup {FIRST, SECOND, THIRD, FOURTH};
    private BloodGroup bloodGroup;
    private String workStatus;

    public Human(String name, Date birthDate, Gender gender, BloodGroup bloodGroup, String workStatus) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.workStatus = workStatus;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", bloodGroup=" + bloodGroup +
                ", workStatus='" + workStatus + '\'' +
                '}';
    }
}
