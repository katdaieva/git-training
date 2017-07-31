package notebook;
/**
 * Created by User on 28.07.2017.
 */
import com.sun.org.apache.xpath.internal.operations.Mod;
import enums.Groups;

import javax.jws.WebParam;

public class Model {
    private String surname;
    private String name;
    private String patronymic;
    private String fullName;
    private String nickName;
    private String comment;
    private String group;
    private String homephone;
    private String cellphone;
    private String secCellphone;
    private String email;
    private String skype;
    private String index;
    private String city;
    private String street;
    private String building;
    private String appartement;
    private String fullAddress;
    private String dateIn;
    private String dateLastUpd;

    public Model() {
    }

    /**
     * get methods
     */

    public String getSurname () {
        return surname;
    }

    public String getName () {
        return  name;
    }

    public String getPatronymic () {
        return patronymic;
    }

    public String getFullName () {
        StringBuilder sb = new StringBuilder();
        sb.append(surname);
        sb.append(" ");
        sb.append(name.substring(0,1));
        sb.append(".");
        return sb.toString();
    }

    public String getNickName () {
        return nickName;
    }

    public String getComment () {
        return comment;
    }

    public String getGroup () {
        return group;
    }

    public String getHomephone () {
        return homephone;
    }

    public String getCellphone () {
        return cellphone;
    }

    public String getSecCellphone () {
        return secCellphone;
    }

    public String getEmail () {
        return email;
    }

    public  String getSkype () {
        return skype;
    }

    public String getIndex () {
        return index;
    }

    public String getCity () {
        return city;
    }

    public String getStreet () {
        return street;
    }

    public String getBuilding () {
        return building;
    }

    public String getAppartement () {
        return appartement;
    }

    public String getFullAddress () {
        StringBuilder sb = new StringBuilder();
        sb.append(index);
        sb.append(", ");
        sb.append(city);
        sb.append("city, ");
        sb.append(street);
        sb.append("street, app. ");
        sb.append(appartement);
        return sb.toString();
    }

    public String getDateIn () {
        return dateIn;
    }

    public String getDateLastUpd () {
        return dateLastUpd;
    }

    /**
     * set methods
     */

    public Model setSurname(String surname) {
        Model.this.surname = surname;
        return this;
    }

    public Model setName(String name) {
        Model.this.name = name;
        return this;
    }

    public Model setPatrynomic (String  patronymic) {
        Model.this.patronymic = patronymic;
        return this;
    }

    public Model setFullName (String fullName) {
        Model.this.fullName = fullName;
        return this;
    }

    public Model setNickName (String nickName) {
        Model.this.nickName = nickName;
        return  this;
    }

    public Model setComment (String comment) {
        Model.this.comment = comment;
        return this;
    }

    public Model setGroup (String group) {
        Model.this.group = group;
        return this;
    }

    public Model setHomephone (String homephone) {
        Model.this.homephone = homephone;
        return this;
    }

    public Model setCellphone (String cellphone) {
        Model.this.cellphone = cellphone;
        return  this;
    }

    public Model setSecCellphone (String secCellphone) {
        Model.this.secCellphone = secCellphone;
        return this;
    }

    public Model setEmail (String email) {
        Model.this.email = email;
        return this;
    }

    public Model setSkype (String skype) {
        Model.this.skype = skype;
        return this;
    }

    public Model setIndex (String index) {
        Model.this.index = index;
        return this;
    }

    public Model setCity (String city) {
        Model.this.city = city;
        return this;
    }

    public Model setStreet (String street) {
        Model.this.street = street;
        return this;
    }

    public Model setBuilding (String building) {
        Model.this.building = building;
        return this;
    }

    public Model setAppartement (String appartement) {
        Model.this.appartement = appartement;
        return this;
    }

    public Model setFullAddress (String fullAddress) {
        Model.this.fullAddress = fullAddress;
        return this;
    }

    public Model setDateIn (String dateIn) {
        Model.this.dateIn = dateIn;
        return this;
    }

    public Model setDateLastUpd (String dateLastUpd) {
        Model.this.dateLastUpd = dateLastUpd;
        return this;
    }

}

