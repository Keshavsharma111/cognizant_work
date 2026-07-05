import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AAAPatternTest {

    private int num1;
    private int num2;

    @Before
    public void setUp() {
        System.out.println("Setup: Initializing values...");
        num1 = 10;
        num2 = 20;
    }

    @After
    public void tearDown() {
        System.out.println("Teardown: Cleaning up...");
    }

    @Test
    public void testAddition() {


        int expected = 30;


        int actual = num1 + num2;


        assertEquals(expected, actual);
    }
}