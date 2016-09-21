public class Frame {
	private int firstThrow;
	private int secondThrow;
	private Frame subsequentFrame;
	
	public Frame(int firstThrow, int secondThrow) throws BowlingException {
		if (firstThrow < 0 || secondThrow < 0)
			throw new BowlingException("Negative throw");
		
		if ((firstThrow + secondThrow) > 10)
			throw new BowlingException("Sum of throws is over maximum");
		
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
		subsequentFrame = null;
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//returns the score of a single frame
	public int score(){
		//to be implemented
		return firstThrow + secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		//to be implemented
		if (10 == getFirstThrow())
			return true;
		
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		/*if ((!isStrike()) && 10 == score())
			return true;*/
		
		return false;
	}
}
