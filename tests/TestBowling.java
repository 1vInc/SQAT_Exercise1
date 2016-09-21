import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void makeAFrame() throws BowlingException {
		int firstThrow = 2;
		int secondThrow = 4;

		Frame aFrame = new Frame(firstThrow, secondThrow);
		
		assertTrue(firstThrow == aFrame.getFirstThrow() &&
						secondThrow == aFrame.getSecondThrow());
	}
	
	@Test
	public void frameScore() throws BowlingException {
		int firstThrow = 2;
		int secondThrow = 6;

		Frame aFrame = new Frame(firstThrow, secondThrow);
		
		assertTrue((firstThrow + secondThrow) == aFrame.score());
	}

}
