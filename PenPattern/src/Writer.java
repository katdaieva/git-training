/**
 * Created by User on 15.08.2017.
 */
public class Writer {
    private WritingPerson writingPerson;
    private Pen pen;
    private Paper paper;

    public Writer(WritingPerson writingPerson, Pen pen, Paper paper) {
        this.writingPerson = writingPerson;
        this.pen = pen;
        this.paper = paper;
    }

    public void writePoem(String text) {
        paper.setText(text);
    }
}
