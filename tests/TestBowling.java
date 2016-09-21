import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
	public void makeGame() throws BowlingException {
		int[] fGames = { 1,3,7,3,4,5,3,4,8,2 };
		int[] sGames = { 5,6,2,6,4,3,3,5,1,6 };
		
		BowlingGame bowlingGame = new BowlingGame();
		
		bowlingGame.createGame(fGames, sGames);
	}
	
	@Test
	public void gameScore() throws BowlingException {
		int[] fGames = { 1,3,7,3,4,5,3,4,8,2 };
		int[] sGames = { 5,6,2,6,4,3,3,5,1,6 };
		
		BowlingGame bowlingGame = new BowlingGame();
		bowlingGame.createGame(fGames, sGames);
		
		assertTrue(bowlingGame.score() == countGameScore(fGames, sGames));
	}
	
	private int countGameScore(int[] fGames, int[] sGames) throws BowlingException {
		int score = 0;
		
		if (fGames.length != sGames.length)
			throw new BowlingException("Amount of first and second throws not equal");
		
		for (int i = 0; i < fGames.length; i++) {
			score += fGames[i] + sGames[i];
		}
		
		return score;
	}
	
	@Test
	public void strike() throws BowlingException {
		int firstThrow = 10;
		int secondThrow = 0;
		
		Frame aFrame = new Frame(firstThrow, secondThrow);
		assertTrue(true == aFrame.isStrike());
	}
	
	@Test
	public void notStrike() throws BowlingException {
		int firstThrow = 0;
		int secondThrow = 10;
		
		Frame aFrame = new Frame(firstThrow, secondThrow);
		assertTrue(false == aFrame.isStrike());
	}
	
	@Test
	public void notStrike2() throws BowlingException {
		int firstThrow = 8;
		int secondThrow = 2;
		
		Frame aFrame = new Frame(firstThrow, secondThrow);
		assertTrue(false == aFrame.isStrike());
	}
	
	@Test
	public void isSpare() throws BowlingException {
		int firstThrow = 8;
		int secondThrow = 2;
		
		Frame aFrame = new Frame(firstThrow, secondThrow);
		assertTrue(true == aFrame.isSpare());
	}
	
	@Test
	public void isSpare2() throws BowlingException {
		int firstThrow = 0;
		int secondThrow = 10;
		
		Frame aFrame = new Frame(firstThrow, secondThrow);
		assertTrue(true == aFrame.isSpare());
	}
	
	@Test
	public void notSpare() throws BowlingException {
		int firstThrow = 10;
		int secondThrow = 0;
		
		Frame aFrame = new Frame(firstThrow, secondThrow);
		assertTrue(false == aFrame.isSpare());
	}
	
	@Test
	public void notSpare2() throws BowlingException {
		int firstThrow = 6;
		int secondThrow = 3;
		
		Frame aFrame = new Frame(firstThrow, secondThrow);
		assertTrue(false == aFrame.isSpare());
	}
	
	@Test
	public void strikeAndSpare() throws BowlingException {
		int[] fGames = { 10,4 };
		int[] sGames = { 0,6 };
	}

}
