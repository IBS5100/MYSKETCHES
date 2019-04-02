import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestCaseInsensitivity {
    @Test
    public void foo() {
        assertTrue("the".equalsIgnoreCase("the"));
        assertTrue("the".equalsIgnoreCase("THE"));
        assertTrue("the".equalsIgnoreCase("ThE"));
        assertTrue("the".equalsIgnoreCase("tHe"));
        assertTrue("ThE".equalsIgnoreCase("tHe"));
    }
}
