package sketch.test.itai;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathOperationsTest {
    //MathOperations m = new MathOperations();

    @Test (expected = IllegalArgumentException.class)
    public void testFactorialException() {
        MathOperations.factorial(-1);
    }

    @Test
    public void testFactorialZeroAndOne() {
        assertEquals(1, MathOperations.factorial(0));
        assertEquals(1, MathOperations.factorial(1));
    }

    @Test
    public void testFactorial() {
        assertEquals(24, MathOperations.factorial(4));
        assertEquals(720, MathOperations.factorial(6));
        assertEquals(5040, MathOperations.factorial(7));
    }

    @Test
    public void testSquare() {
        assertTrue(9 == MathOperations.square(-3));
        assertTrue(0 == MathOperations.square(0));
        assertTrue(6.25 == MathOperations.square(2.5));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testReciprocalException() {
        MathOperations.reciprocal(0);
    }

    @Test
    public void testReciprocal() {
        assertTrue(1 == MathOperations.reciprocal(1));
        assertTrue(.2 == MathOperations.reciprocal(5));
        assertTrue(-.25 == MathOperations.reciprocal(-4));
    }
}