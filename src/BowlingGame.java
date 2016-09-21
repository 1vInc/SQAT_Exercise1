import java.util.ArrayList;
import java.util.List;

//Finish time: 16:35
//ID: 102

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> game = new ArrayList<Frame>();
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){
		
	}
	
	/*int[] fGames = { 1,1,1,1,1,1,1,1,1,1 };
	int[] sGames = { 1,1,1,1,1,1,1,1,1,1 };
	
	try {
		Frame aFrame = new Frame(1,1);
	} catch (BowlingException e) {
		System.err.println("Trying to create invalid frame: " + e.getMessage());
	}

	try {
		createGame(fGames, sGames, game);
	} catch (BowlingException e) {
		System.err.println("Trying to create invalid game: " + e.getMessage());
	}*/
	
	public void createGame(int firstThrows[], int secondThrows[]) throws BowlingException {
		doCreateGame(firstThrows, secondThrows);
	}
	
	private void doCreateGame(int first[], int second[]) throws BowlingException {
		Frame newFrame = null;
		Frame prevFrame = null;
		
		if (first.length != second.length)
			throw new BowlingException("Throw amounts do not match");
		
		if(!(first.length >= 10 && second.length >= 10))
			throw new BowlingException("Can't create enough frames for game");
		
		for (int i = 0; i < first.length; i++) {
			newFrame = new Frame(first[i], second[i]);
			addFrame(newFrame);
			if (null != prevFrame)
				prevFrame.subsequentFrame(newFrame);
			prevFrame = newFrame;
		}
	}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		//to be implemented
		game.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		return countScore();
	}
	
	private int countScore() {
		int score = 0;
		
		for (int i = 0; i < game.size(); i++) {
			score += game.get(i).score();
		}
		
		return score;
	}
}
