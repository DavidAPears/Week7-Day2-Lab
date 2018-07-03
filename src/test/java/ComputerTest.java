import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Keyboard keyboard;
    Mouse mouse;

    @Before
    public void before() {
        mouse = new Mouse("Tracker Ball", 3);
        monitor = new Monitor(22, 786432);
        keyboard = new Keyboard("Wireless", 101);
        computer = new Computer(8, 512, monitor, keyboard);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

//    TESTS FOR OUTPUT

    @Test
    public void hasOutputDevice() {
        assertNotNull(computer.getOutputDevice());
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter(){
        Printer printer = new Printer("Epson", "Styluis", 120, 4);
        computer = new Computer(8, 512, printer, keyboard);
        assertEquals("printing: holiday pictures", computer.outputData("holiday pictures"));
    }

    @Test
    public void canOutputDataViaSpeaker(){
        Speaker speaker = new Speaker(100);
        computer = new Computer(8, 512, speaker, keyboard);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canSetOutputDevice(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: dissertation", computer.outputData("dissertation"));
    }

//    TESTS FOR INPUT

    @Test
    public void hasInputDevice() {
        assertNotNull(computer.getInputDevice());
    }

    @Test
    public void canInputData() {
        assertEquals("Wireless Keyboard is being used", computer.inputData("Wireless Keyboard"));
    }

    @Test
    public void canSetInputDevice(){
        Mouse mouse = new Mouse("Tracker Ball", 3);
        computer.setInputDevice(mouse);
        assertEquals("mousing: circle", computer.outputData("circle"));
    }
}
