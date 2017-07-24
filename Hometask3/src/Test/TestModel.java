/**
 * Created by User on 24.07.2017.
 */
package Test;

import MoreOrLess.Model;
import org.junit.Assert;
import org.junit.Test;

public class TestModel {
    @Test
    public void testRand() {
        Model m = new Model();
        int secretNumber  = m.rand(0,100);
        if ((secretNumber >= 100) | (secretNumber <= 0)) Assert.fail();
    }
}
