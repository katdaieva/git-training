/**
 * Created by User on 26.07.2017.
 */
public class Model {
    private String value;
    private String res;

    // The Program logic

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void concatValues (String value) {
        if (res == null)
            res = value;
        else
            res += ' '+ value;}

    public String getValueConcat() {return res;}
}
