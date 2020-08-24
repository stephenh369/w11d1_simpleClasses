import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {
    Printer printer;
    Printer emptyPrinter;

    @Before
    public void before() {
        printer = new Printer(50);
        emptyPrinter = new Printer(0);
    }

    @Test
    public void hasPaper() {
        assertEquals(50, printer.getPaper());
    }

    @Test
    public void print() {
        printer.print(3, 2);
        assertEquals(6, printer.getPrinted());
        assertEquals(44, printer.getPaper());
    }

    @Test
    public void printEmpty() {
        emptyPrinter.print(3, 2);
        assertEquals(0, emptyPrinter.getPrinted());
        assertEquals(0, emptyPrinter.getPaper());
    }
}
