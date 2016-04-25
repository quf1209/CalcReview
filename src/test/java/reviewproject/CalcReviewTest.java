package reviewproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcReviewTest {

	@Test
	public void test() {
		CalcReview r = new CalcReview();
		r.add(10, 20);
		assertEquals(30, r.getResult());
	}

}
