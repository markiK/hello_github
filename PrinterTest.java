import static org.junit.Assert.*;

import org.junit.Test;


public class PrinterTest {
	
	String setence = "Hello world!";
	Printer p = new Printer(setence);

	@Test
	public void test() {
		assertEquals(setence, p.getSetence());
	}
}
