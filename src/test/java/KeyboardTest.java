import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KeyboardTest {
    Keyboard keyboard;

    @Before
    public void before() {
        keyboard = new Keyboard("Wireless", 101);
    }

    @Test
    public void hasType() {
        assertEquals("Wireless", keyboard.getType());
    }

}
