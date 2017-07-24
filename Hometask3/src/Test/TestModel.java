/**
 * Created by User on 24.07.2017.
 */
package Test;

import MoreOrLess.Model;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestModel {
    private Model m;

    @Before
    public void runT(){
        m = new Model();
    }

    @Test
    public void testRand() {
        int secretNumber  = m.rand(0,100);
        if ((secretNumber >= 100) | (secretNumber <= 0)) Assert.fail();
    }

    @Test
    public void testGiveLessAnswer() {
        String answer = m.giveAnswer(50,77);
        Assert.assertEquals(answer, "Less");
    }

    @Test
    public void testGiveMoreAnswer() {
        String answer = m.giveAnswer(80,77);
        Assert.assertEquals(answer, "More");
    }

    @Test
    public void testGiveVictoryAnswer() {
        String answer = m.giveAnswer(80,80);
        Assert.assertEquals(answer, "Yes");
    }
}
