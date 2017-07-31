package notebook;

/**
 * Created by User on 28.07.2017.
*/
import enums.Groups;

public class View {
    public void printMessage(String message) {
        System.out.println(message);
    }

    public static final String ASK_SURNAME = "Enter your surname:";
    public static final String ASK_NAME = "Enter your name:";
    public static final String ASK_PATRONYMIC = "Enter your patronymic:";
    public static final String ASK_NICKNAME = "Enter your nickname: ";
    public static final String ASK_COMMENT = "Enter the comment: ";
    public static final String ASK_GROUP = "Enter the group name: a) " + Groups.FAMILY + "; b) " + Groups.FRIENDS
            + "; c) " + Groups.COWORKERS + "; d) " + Groups.NO_GROUP;
    public static final String ASK_HOME_PHONE = "Enter your home phone number:";
    public static final String ASK_CELL_PHONE = "Enter your cellphone number:";
    public static final String ASK_SEC_CELL_PHONE =
            "Enter your second cellphone number (if you don't have the second one, just click ENTER):";
    public static final String ASK_EMAIL = "Enter your e-mail:";
    public static final String ASK_SKYPE = "Enter your skype:";
    public static final String ASK_INDEX = "Enter your index:";
    public static final String ASK_CITY = "Enter your city:";
    public static final String ASK_STREET = "Enter your street:";
    public static final String ASK_BUILDING = "Enter your building number:";
    public static final String ASK_APPARTEMENT = "Enter the number of your appartement:";
    public static final String ASK_DATE_IN = "Enter the appering date of this note:";
    public static final String ASK_DATE_LAST_UPDATE = "Enter the date when you've updated this note the last time:";



    public static final String INPUT_WRONG = "Please be careful and enter the data that matches ";


    public static final String REG_NAME = "^[A-Za-z]+{2,20}$";
    public static final String REG_NICKNAME = "^[a-z0-9_-]{3,16}$";
    public static final String REG_COMMENT = "^.{1,50}";
    public static final String REG_HOME_PHONE = "^[0-9]{7}$";
    public static final String REG_CELL_PHONE = "^\\+380[0-9]{9}$";
    public static final String REG_SEC_CELL_PHONE = "^\\+380[0-9]{9}||\\s{1}$";
    public static final String REG_EMAIL = "^[A-Za-z0-9_]{2,255}@[a-z]{1,15}\\.[a-z]{1,5}$";



}
