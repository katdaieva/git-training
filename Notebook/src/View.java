/**
 * Created by User on 28.07.2017.
 */
public class View {
    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatenation(String string1, String string2) {
        StringBuilder sb = new StringBuilder();
        sb.append(string1);
        sb.append(string2);
        return sb.toString();
    }

    public String concatenation(String string1, String string2, String string3, String string4) {
        StringBuilder sb = new StringBuilder();
        sb.append(string1);
        sb.append(string2);
        sb.append(string3);
        sb.append(string4.substring(0,1));
        sb.append(".");
        return sb.toString();
    }

    public static final String ASK_SURNAME = "Enter your surname:";
    public static final String ASK_NAME = "Enter your name:";
    public static final String ASK_PATRONYMIC = "Enter your patronymic:";
    public static final String ASK_NICKNAME = "Enter your nickname: ";
    public static final String ASK_COMMENT = "Enter the comment: ";

    public static final String INPUT_WRONG = "Please be careful and enter the data that matches ";


    public static final String REG_NAME = "^[A-Za-z]+{2,20}$";
    public static final String REG_NICKNAME = "^[a-z0-9_-]{3,16}$";
    public static final String REG_COMMENT = "^[a-zA-Z0-9]+$";


}
