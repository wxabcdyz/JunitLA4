import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AdditionTest {

    @Test
    public void testAddition() {
        int result = add(5, 3);
        assertEquals(9, result);
    }

    public int add(int a, int b) {
        return a + b;
    }
}