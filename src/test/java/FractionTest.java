import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest {
    private Fraction fraction1;
    private Fraction fraction2;

    @Before
    public void setUp(){

        fraction1 = new Fraction(1,1);
        fraction2 = new Fraction(1,1);
    }


    @Test
    public void testAdd(){

        Assert.assertEquals(2, fraction1.add(fraction2).fractionResult());

    }

    @After
    public void tearDown(){
    }
}
