import static org.junit.Assert.*;

import org.junit.Test;

public class StackCalculatorTest {

    @Test
    public void subtractTest() throws Exception {
        StackCalculator c = new StackCalculator();
        assertEquals(8.0, c.calculate("5,6,7,5,7,-,-,-,-"),2);
    }

    @Test
    public void pluTest() throws Exception {
        StackCalculator c = new StackCalculator();
        assertEquals(39.0, c.calculate("1,23,4,5,6,+,+,+,+"),2);
    }

    @Test
    public void timesTest() throws Exception {
        StackCalculator c = new StackCalculator();
        assertEquals(2.0, c.calculate("1,2,*"),2);
    }

    @Test
    public void divideTest() throws Exception {
        StackCalculator c = new StackCalculator();
        assertEquals(0.5, c.calculate("1,2,/"), 2);
    }

}