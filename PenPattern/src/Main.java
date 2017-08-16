/**
 * Created by User on 15.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen(Color.RED);
        Paper paper = new Paper("");

        WritingPerson wP = new Human("Isaak", Human.Hand.LEFT);

        System.out.println(paper.getText());

        Writer writer = new Writer(wP, pen, paper);
        writer.writePoem("privet");

        System.out.println(paper.getText());
    }
}
