import static org.junit.Assert.*;

import org.junit.Test;

public class TooHotTest {

	@Test
	public void test() {
		assertEquals(TooHot.tooHot(70, true),true);
	}

}
