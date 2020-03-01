package TestH2;

import static org.junit.Assert.*;
import org.junit.Test;
import Source.CalcSrc;

public class CalcTest {
	@Test
	public void test() {
//	fail("Not yet implemented");
		CalcSrc ob=new CalcSrc();
		
		int act=ob.add(4,2);
		assertTrue(6==act);

	}

}
