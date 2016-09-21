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
	
	@Test
	public void makeGame() throws BowlingException() {
		int[] fGames = { 1,3,7,3,4,5,3,4,8,2 };
		int[] sGames = { 5,6,2,6,4,3,3,5,1,6 };
		
		try {
			createGame(fGames, sGames, game);
		} catch (BowlingException e) {
			System.err.println("Trying to create invalid game: " + e.getMessage());
		}
	}

}
