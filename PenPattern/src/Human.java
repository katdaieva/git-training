/**
 * Created by User on 15.08.2017.
 */
public class Human implements WritingPerson{
    private String name;
    private Hand hand;

    public Human(String name, Hand hand) {
        this.name = name;
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}

