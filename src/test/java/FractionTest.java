import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction fraction1;
    private Fraction fraction2;

    @Before
    public void setUp() {

        fraction1 = new Fraction(6,1);
        fraction2 = new Fraction(1,1);

    }

    @Test(expected=IllegalArgumentException.class)
    public void denominatorIsZero(){

        new Fraction(1, 0);
    }

    @Test
    public void denominatorIsOne(){

        Assert.assertEquals(6, fraction1.fractionResult());
    }

    @Test
    public void numeratorIsZero(){

        Assert.assertEquals(0,  new Fraction(0, 6).fractionResult());
    }


    @Test
    public void testAdd(){

        Assert.assertEquals(7, fraction1.add(fraction2).fractionResult());
    }

    @Test
    public void testSubtract(){

        Assert.assertEquals(5, fraction1.subtract(fraction2).fractionResult());
    }

    @Test
    public void testMultiply(){

        Assert.assertEquals(6, fraction1.multiply(fraction2).fractionResult());
    }

    @Test
    public void testDivide(){

        Assert.assertEquals(6, fraction1.divide(fraction2).fractionResult());
    }

    @Test(expected=IllegalArgumentException.class)
    public void testDivideWithDenominatorIsZero(){

        fraction1.divide(new Fraction(3, 0)).fractionResult();
    }

    @After
    public void tearDown() {
        fraction1 = null;
        fraction2 = null;
    }
}
