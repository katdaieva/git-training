package test;

import moreOrLess.Model;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.Exception;

/**
 * Created by User on 26.07.2017.
 */
public class ModelTest {
    private static Model m;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000);

    @BeforeClass
    public static void runT(){
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

    //@Test(expected = Exception.class)
    /*@Ignore
    @Test
    public void testGiveAnswerExc () {
        exp.expect(Exception.class);
        m.giveAnswer(0,0);
    }*/

    @Ignore
    @Test
    public void testN(){
        while (true) {

        }
    }
}
