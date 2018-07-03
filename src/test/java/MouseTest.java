import device_management.Keyboard;
import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MouseTest {
    Mouse mouse;

    @Before
    public void before() {
        mouse = new Mouse("Tracker Ball", 3);
    }

    @Test
    public void hasType() {
        assertEquals("Tracker Ball", mouse.getType());
    }

    @Test
    public void hasNoOfKeys() { assertEquals(3, mouse.getNoOfKeys());}
}

